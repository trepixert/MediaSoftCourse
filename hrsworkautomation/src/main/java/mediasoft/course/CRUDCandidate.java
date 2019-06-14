package mediasoft.course;

class CRUDCandidate implements CRUDInterface{

    public void addCandidate(Candidate candidate) throws NullPointerException{
        if(candidate == null) throw new NullPointerException("Отсутствует объект");
    }

    public Candidate deleteCandidate(String... info) throws NullPointerException{
        if(checkToNull(info.length)) throw new NullPointerException("Не указан идентификатор кандидата");
        return null;
    }

    public Candidate findCandidate(String... info)throws NullPointerException{
        if(checkToNull(info.length)) throw new NullPointerException("Не указан идентификатор кандидата");
        return null;
    }

    public void updateCandidate(String... info) throws NullPointerException{
        if(checkToNull(info.length)) throw new NullPointerException("Не указан идентификатор кандидата");
    }

    private boolean checkToNull(int length){
        return (length==0);
    }
}
