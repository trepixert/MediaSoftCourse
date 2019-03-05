package mediasoft.course;

interface CRUDInterface {
    void addCandidate(Candidate candidate);
    Candidate deleteCandidate(String... info);
    Candidate findCandidate(String... info);
    void updateCandidate(String... info);
}
