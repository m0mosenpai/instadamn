package X;

/* renamed from: X.CeQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28338CeQ {
    public static Integer A00(String str) {
        if (str.equals("FB_COMMENTS_CREATION")) {
            return C05F.A00;
        }
        if (str.equals("FB_POST_CREATION")) {
            return C05F.A01;
        }
        if (str.equals("FB_POST_CREATION_CAPTIONS")) {
            return C05F.A0C;
        }
        if (str.equals("FB_STORIES_CREATION")) {
            return C05F.A0N;
        }
        if (str.equals("IG_STORIES_CREATION")) {
            return C05F.A0Y;
        }
        if (str.equals("IG_STORIES_IMAGE_CAPTION")) {
            return C05F.A0j;
        }
        if (str.equals("BLOKS")) {
            return C05F.A0u;
        }
        if (str.equals("FB_VIDEO_CREATION")) {
            return C05F.A15;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "fb_post_creation";
            case 2:
                return "fb_post_creation_captions";
            case 3:
                return "fb_stories_creation";
            case 4:
                return AbstractC43591JPw.A00(163);
            case 5:
                return "ig_stories_image_caption";
            case 6:
                return "Bloks";
            case 7:
                return "fb_video_creation";
            default:
                return "fb_comments_creation";
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FB_POST_CREATION";
            case 2:
                return "FB_POST_CREATION_CAPTIONS";
            case 3:
                return "FB_STORIES_CREATION";
            case 4:
                return "IG_STORIES_CREATION";
            case 5:
                return "IG_STORIES_IMAGE_CAPTION";
            case 6:
                return "BLOKS";
            case 7:
                return "FB_VIDEO_CREATION";
            default:
                return "FB_COMMENTS_CREATION";
        }
    }
}
