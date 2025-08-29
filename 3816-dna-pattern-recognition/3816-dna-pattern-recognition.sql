# Write your MySQL query statement belows
select sample_id , dna_sequence,species ,(
    case 
    when dna_sequence  regexp "^ATG"
    then 1
    else 0
    end
) as has_start,
(
    case 
    when dna_sequence  regexp "TAA$|TAG$|TGA$"
    then 1
    else 0
    end
)as has_stop , (
    case 
    when dna_sequence  regexp "atat"
    then 1
    else 0
    end
) as has_atat ,
(
    case 
    when dna_sequence  regexp "ggg"
    then 1
    else 0
    end
) as has_ggg from samples ;