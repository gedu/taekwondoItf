package com.roae.taeitf.taeitf.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;

public class Belt {

    @SerializedName("name")
    private String name;

    @SerializedName("gup")
    private String gup;

    @SerializedName("mov_count")
    private Integer movCount;

    @SerializedName("graph_url_img")
    private String graphUrlImg;

    @SerializedName("pre_position")
    private String prePosition;

    @SerializedName("meaning")
    private String meaning;

    @SerializedName("desc")
    private String desc;

    @SerializedName("step_by_step")
    private String stepByStep;

    @SerializedName("color")
    private String color;

    public Belt(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.gup = ((String) in.readValue((String.class.getClassLoader())));
        this.movCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.graphUrlImg = ((String) in.readValue((String.class.getClassLoader())));
        this.prePosition = ((String) in.readValue((String.class.getClassLoader())));
        this.meaning = ((String) in.readValue((String.class.getClassLoader())));
        this.desc = ((String) in.readValue((String.class.getClassLoader())));
        this.stepByStep = ((String) in.readValue((String.class.getClassLoader())));
        this.color = ((String) in.readValue((String.class.getClassLoader())));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGup() {
        return gup;
    }

    public void setGup(String gup) {
        this.gup = gup;
    }

    public Integer getMovCount() {
        return movCount;
    }

    public void setMovCount(Integer movCount) {
        this.movCount = movCount;
    }

    public String getGraphUrlImg() {
        return graphUrlImg;
    }

    public void setGraphUrlImg(String graphUrlImg) {
        this.graphUrlImg = graphUrlImg;
    }

    public String getPrePosition() {
        return prePosition;
    }

    public void setPrePosition(String prePosition) {
        this.prePosition = prePosition;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStepByStep() {
        return stepByStep;
    }

    public void setStepByStep(String stepByStep) {
        this.stepByStep = stepByStep;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(gup);
        dest.writeValue(movCount);
        dest.writeValue(graphUrlImg);
        dest.writeValue(prePosition);
        dest.writeValue(meaning);
        dest.writeValue(desc);
        dest.writeValue(stepByStep);
        dest.writeValue(color);
    }

    public int describeContents() {
        return 0;
    }

    public final static Parcelable.Creator<Belt> CREATOR = new Creator<Belt>() {

        @SuppressWarnings({"unchecked"})
        public Belt createFromParcel(Parcel in) {
            return new Belt(in);
        }

        public Belt[] newArray(int size) {
            return (new Belt[size]);
        }
    };

    @Override
    public String toString() {
        return "name: "+ name
                +"gup: "+ gup
                +"movCount: "+ movCount
                +"graphUrlImg: "+ graphUrlImg
                +"prePosition: "+ prePosition
                +"meaning: "+ meaning
                +"desc: "+ desc
                +"stepByStep: "+ stepByStep
                +"color: "+ color;
    }

}
