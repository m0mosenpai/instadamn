package X;

/* loaded from: classes6.dex */
public abstract class FA8 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "editing_end";
            case 2:
                return "uploading_start";
            case 3:
                return "uploading_end";
            case 4:
                return "library_selection_start";
            case 5:
                return "library_selection_end";
            case 6:
                return "filter_selection_start";
            case 7:
                return "filter_selection_end";
            case 8:
                return "uploading_file_start";
            case 9:
                return "uploading_file_end";
            case 10:
                return "profile_picture_start";
            case 11:
                return "profile_picture_end";
            default:
                return "editing_start";
        }
    }
}
