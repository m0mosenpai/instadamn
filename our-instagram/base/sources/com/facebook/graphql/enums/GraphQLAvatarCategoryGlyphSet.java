package com.facebook.graphql.enums;

import X.AbstractC72048XLo;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes12.dex */
public final class GraphQLAvatarCategoryGlyphSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[57];
        System.arraycopy(new String[]{"ACCESSORIES", "AGE", "BINDI", "BLUSH", "BODY", "BOTTOMS", "CLOSET", "CLOTHING", "COLOR", "DRESSES", "EAR", "EARS", "EAR_PIERCINGS", "EYE", "EYEBROWS", "EYES", "EYEWEAR", "EYE_MAKEUP", "EYE_SHADOW", "FACE", "FACE_LINES", "FACE_MARKINGS", "FACE_PAINT", "FACE_SHAPE", "FACIAL_HAIR", "FINISH", "GLASSES"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"HAIR", "HAIR_STYLE", "HEAD", "HEADWEAR", "HEARING_DEVICE", "HEARING_DEVICE_COLOR", "HOME_FEED", "JAW_LINE", "JEWELLERY", "LASH", "LASHES", "LIPSTICK", "LIP_COLOR", "LOWER_LASHES", "MAGIC_WAND", "MAKEUP", "MOUSTACHE", "MOUTH", "NOSE", "NOSE_PIERCINGS", "ONE_PIECE", "OUTFIT", "PIERCINGS", "SHOES", "SKELETON", "SKIN", "SKIN_TONE"}, 0, strArr, 27, 27);
        A00 = AbstractC72048XLo.A0N(new String[]{"STORE", "TOPS", "UPPER_LASHES"}, strArr, 0, 54, 3);
    }

    public static final Set getSet() {
        return A00;
    }
}
