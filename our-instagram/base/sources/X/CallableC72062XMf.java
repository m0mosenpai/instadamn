package X;

import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.XMf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC72062XMf implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public CallableC72062XMf(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0004. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x06b6: INVOKE (r1 I:android.database.Cursor) INTERFACE call: android.database.Cursor.close():void A[MD:():void (c)] (LINE:1718), block:B:273:0x06b6 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [X.MsD] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        Cursor A00;
        ?? r2;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        Object obj;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        String string20;
        try {
            switch (this.A00) {
                case 0:
                    C208789Lm c208789Lm = (C208789Lm) this.A01;
                    Object obj2 = this.A02;
                    int i = 0;
                    try {
                        try {
                            C175237qx c175237qx = c208789Lm.A0Q;
                            int i2 = 0;
                            if (!C2I7.A00(obj2, c175237qx.A03)) {
                                i2 = 1;
                            }
                            AbstractC175037qd.A00(24, i2, null);
                            c208789Lm.A0B();
                            AbstractC175037qd.A00(25, !C2I7.A00(obj2, c175237qx.A03) ? 1 : 0, null);
                            return null;
                        } catch (Exception e) {
                            if (!C2I7.A00(obj2, c208789Lm.A0Q.A03)) {
                                i = 1;
                            }
                            AbstractC175037qd.A00(26, i, e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        AbstractC175037qd.A00(25, !C2I7.A00(obj2, c208789Lm.A0Q.A03) ? 1 : 0, null);
                        throw th;
                    }
                case 1:
                    C208789Lm c208789Lm2 = (C208789Lm) this.A01;
                    AbstractC176797tb abstractC176797tb = (AbstractC176797tb) this.A02;
                    if (c208789Lm2.isConnected()) {
                        C72096XNq c72096XNq = c208789Lm2.A0K;
                        Camera camera = c208789Lm2.A0Z;
                        C176877tj c176877tj = (C176877tj) abstractC176797tb.A02(AbstractC176797tb.A0q);
                        Object A02 = abstractC176797tb.A02(AbstractC176797tb.A0m);
                        A02.getClass();
                        c72096XNq.A02(camera, c176877tj, ((Number) A02).intValue());
                        return null;
                    }
                    return null;
                case 2:
                    C208789Lm c208789Lm3 = (C208789Lm) this.A01;
                    C177007tw c177007tw = (C177007tw) this.A02;
                    if (c208789Lm3.A0b != null) {
                        c208789Lm3.A0b.CFN();
                    }
                    c208789Lm3.A0F("Cannot modify settings");
                    int i3 = c208789Lm3.A00;
                    if (c208789Lm3.A0b != null) {
                        c208789Lm3.A0b.CFN();
                    }
                    C208989Mg c208989Mg = c208789Lm3.A0N;
                    c208989Mg.A00(i3).A05(c177007tw);
                    return c208989Mg.A02(c208789Lm3.A00);
                case 3:
                    C208789Lm c208789Lm4 = (C208789Lm) this.A01;
                    c208789Lm4.A0J.A01.A01(this.A02);
                    return null;
                case 4:
                    C208789Lm c208789Lm5 = (C208789Lm) this.A01;
                    Rect rect = (Rect) this.A02;
                    obj = null;
                    if (c208789Lm5.isConnected()) {
                        C208789Lm.A07(c208789Lm5);
                        c208789Lm5.A0I.A03(rect, new C23435Aa8(c208789Lm5, 0));
                        return null;
                    }
                    return obj;
                case 5:
                    C208789Lm c208789Lm6 = (C208789Lm) this.A01;
                    Rect rect2 = (Rect) this.A02;
                    obj = null;
                    obj = null;
                    if (c208789Lm6.isConnected() && ((Boolean) c208789Lm6.AlU().A01(AbstractC176767tY.A0W)).booleanValue()) {
                        C208999Mh A01 = C208789Lm.A01(c208789Lm6, c208789Lm6.A00);
                        ((AbstractC176827te) A01).A00.A01(AbstractC176797tb.A0f, C9MZ.A00(rect2));
                        A01.A03();
                        return null;
                    }
                    return obj;
                case 6:
                    C208789Lm c208789Lm7 = (C208789Lm) this.A01;
                    c208789Lm7.A0J.A01.A02(this.A02);
                    return null;
                case 7:
                    C208789Lm c208789Lm8 = (C208789Lm) this.A01;
                    C208979Mf c208979Mf = c208789Lm8.A0J;
                    Camera camera2 = (Camera) this.A02;
                    c208979Mf.A01(true, camera2);
                    obj = null;
                    obj = null;
                    try {
                        camera2.setPreviewTexture(null);
                    } catch (IOException e2) {
                        android.util.Log.e(AbstractC111324zv.A00(3525), "Unable to remove the current SurfaceTexture", e2);
                    }
                    c208789Lm8.A0K.A01(camera2);
                    C0fE.A00(camera2);
                    C176347sr c176347sr = c208789Lm8.A0a;
                    if (c176347sr != null) {
                        String A022 = c208789Lm8.A0Q.A02();
                        if (!c176347sr.A00.isEmpty()) {
                            C176567tE.A00(new RunnableC200698uC(c176347sr, A022));
                            return null;
                        }
                    }
                    return obj;
                case 8:
                    XW2 xw2 = (XW2) this.A01;
                    C196548mk c196548mk = (C196548mk) this.A02;
                    C208789Lm c208789Lm9 = (C208789Lm) xw2.A01;
                    Object A002 = c196548mk.A00(C196548mk.A08);
                    A002.getClass();
                    C208789Lm.A0A(c208789Lm9, ((Boolean) A002).booleanValue());
                    return null;
                case 9:
                    Cursor A003 = C3EP.A00(((C43612JQv) this.A01).A01, (C37581ov) this.A02, false);
                    try {
                        int A012 = AbstractC37601ox.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        int A013 = AbstractC37601ox.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        int A014 = AbstractC37601ox.A01(A003, "data");
                        int A015 = AbstractC37601ox.A01(A003, "stored_time");
                        int A016 = AbstractC37601ox.A01(A003, "ranking_score");
                        ArrayList arrayList = new ArrayList(A003.getCount());
                        while (A003.moveToNext()) {
                            arrayList.add(new C126495nk(A003.getString(A012), A003.getString(A013), A003.getBlob(A014), A003.getFloat(A016), A003.getLong(A015)));
                        }
                        return arrayList;
                    } finally {
                        A003.close();
                    }
                case 10:
                case 11:
                default:
                    A00 = C3EP.A00(((MXP) this.A01).A02, (C37581ov) this.A02, false);
                    int A017 = AbstractC37601ox.A01(A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A018 = AbstractC37601ox.A01(A00, "is_uploading");
                    int A019 = AbstractC37601ox.A01(A00, "video_path");
                    int A0110 = AbstractC37601ox.A01(A00, "video_orig_rotation");
                    int A0111 = AbstractC37601ox.A01(A00, "video_orig_width");
                    int A0112 = AbstractC37601ox.A01(A00, "video_orig_height");
                    int A0113 = AbstractC37601ox.A01(A00, "duration");
                    int A0114 = AbstractC37601ox.A01(A00, DialogModule.KEY_TITLE);
                    int A0115 = AbstractC37601ox.A01(A00, DevServerEntity.COLUMN_DESCRIPTION);
                    int A0116 = AbstractC37601ox.A01(A00, "series_id");
                    int A0117 = AbstractC37601ox.A01(A00, "is_unified_video");
                    int A0118 = AbstractC37601ox.A01(A00, "filter_id");
                    int A0119 = AbstractC37601ox.A01(A00, "filter_strength");
                    int A0120 = AbstractC37601ox.A01(A00, "post_crop_aspect_ratio");
                    int A0121 = AbstractC37601ox.A01(A00, "is_landscape_surface");
                    int A0122 = AbstractC37601ox.A01(A00, "is_over_image_custom");
                    int A0123 = AbstractC37601ox.A01(A00, "cover_image_file_path");
                    int A0124 = AbstractC37601ox.A01(A00, "cover_image_width");
                    int A0125 = AbstractC37601ox.A01(A00, "cover_image_height");
                    int A0126 = AbstractC37601ox.A01(A00, "cover_image_video_time_mx");
                    int A0127 = AbstractC37601ox.A01(A00, "is_cover_image_fram_video_edited");
                    int A0128 = AbstractC37601ox.A01(A00, "is_preview_enabled");
                    int A0129 = AbstractC37601ox.A01(A00, "preview_crop_coords");
                    int A0130 = AbstractC37601ox.A01(A00, "profile_crop_coords");
                    int A0131 = AbstractC37601ox.A01(A00, "is_internal");
                    int A0132 = AbstractC37601ox.A01(A00, "group_destination_user_id");
                    int A0133 = AbstractC37601ox.A01(A00, "share_to_facebook");
                    int A0134 = AbstractC37601ox.A01(A00, "are_captions_enabled");
                    int A0135 = AbstractC37601ox.A01(A00, "are_comments_disabled");
                    int A0136 = AbstractC37601ox.A01(A00, "is_funded_content_deal");
                    int A0137 = AbstractC37601ox.A01(A00, "is_like_and_view_counts_disabled");
                    int A0138 = AbstractC37601ox.A01(A00, "is_paid_partnership");
                    int A0139 = AbstractC37601ox.A01(A00, "branded_content_info");
                    int A0140 = AbstractC37601ox.A01(A00, "partner_boost_enabled");
                    int A0141 = AbstractC37601ox.A01(A00, "shopping_info");
                    int A0142 = AbstractC37601ox.A01(A00, "created_timestamp");
                    int A0143 = AbstractC37601ox.A01(A00, "last_modified_timestamp");
                    r2 = new ArrayList(A00.getCount());
                    while (A00.moveToNext()) {
                        int i4 = A00.getInt(A017);
                        boolean z = false;
                        if (A00.getInt(A018) != 0) {
                            z = true;
                        }
                        String string21 = A00.getString(A019);
                        int i5 = A00.getInt(A0110);
                        int i6 = A00.getInt(A0111);
                        int i7 = A00.getInt(A0112);
                        long j = A00.getLong(A0113);
                        String string22 = A00.getString(A0114);
                        String string23 = A00.getString(A0115);
                        if (A00.isNull(A0116)) {
                            string14 = null;
                        } else {
                            string14 = A00.getString(A0116);
                        }
                        boolean z2 = false;
                        if (A00.getInt(A0117) != 0) {
                            z2 = true;
                        }
                        int i8 = A00.getInt(A0118);
                        int i9 = A00.getInt(A0119);
                        float f = A00.getFloat(A0120);
                        boolean z3 = false;
                        if (A00.getInt(A0121) != 0) {
                            z3 = true;
                        }
                        boolean z4 = false;
                        if (A00.getInt(A0122) != 0) {
                            z4 = true;
                        }
                        if (A00.isNull(A0123)) {
                            string15 = null;
                        } else {
                            string15 = A00.getString(A0123);
                        }
                        int i10 = A00.getInt(A0124);
                        int i11 = A00.getInt(A0125);
                        int i12 = A00.getInt(A0126);
                        boolean z5 = false;
                        if (A00.getInt(A0127) != 0) {
                            z5 = true;
                        }
                        boolean z6 = false;
                        if (A00.getInt(A0128) != 0) {
                            z6 = true;
                        }
                        if (A00.isNull(A0129)) {
                            string16 = null;
                        } else {
                            string16 = A00.getString(A0129);
                        }
                        RectF A004 = OPE.A00(string16);
                        if (A00.isNull(A0130)) {
                            string17 = null;
                        } else {
                            string17 = A00.getString(A0130);
                        }
                        RectF A005 = OPE.A00(string17);
                        boolean z7 = false;
                        if (A00.getInt(A0131) != 0) {
                            z7 = true;
                        }
                        if (A00.isNull(A0132)) {
                            string18 = null;
                        } else {
                            string18 = A00.getString(A0132);
                        }
                        boolean z8 = false;
                        if (A00.getInt(A0133) != 0) {
                            z8 = true;
                        }
                        boolean z9 = false;
                        if (A00.getInt(A0134) != 0) {
                            z9 = true;
                        }
                        boolean z10 = false;
                        if (A00.getInt(A0135) != 0) {
                            z10 = true;
                        }
                        boolean z11 = false;
                        if (A00.getInt(A0136) != 0) {
                            z11 = true;
                        }
                        boolean z12 = false;
                        if (A00.getInt(A0137) != 0) {
                            z12 = true;
                        }
                        boolean z13 = false;
                        if (A00.getInt(A0138) != 0) {
                            z13 = true;
                        }
                        if (A00.isNull(A0139)) {
                            string19 = null;
                        } else {
                            string19 = A00.getString(A0139);
                        }
                        IGTVBrandedContentTags A006 = OPF.A00(string19);
                        boolean z14 = false;
                        if (A00.getInt(A0140) != 0) {
                            z14 = true;
                        }
                        if (A00.isNull(A0141)) {
                            string20 = null;
                        } else {
                            string20 = A00.getString(A0141);
                        }
                        r2.add(new C51682MsD(A004, A005, A006, OPG.A00(string20), string21, string22, string23, string14, string15, string18, f, i4, i5, i6, i7, i8, i9, i10, i11, i12, j, A00.getLong(A0142), A00.getLong(A0143), z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14));
                    }
                    A00.close();
                    obj = r2;
                    return obj;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    A00 = C3EP.A00(((MXP) this.A01).A02, (C37581ov) this.A02, false);
                    int A0144 = AbstractC37601ox.A01(A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A0145 = AbstractC37601ox.A01(A00, "is_uploading");
                    int A0146 = AbstractC37601ox.A01(A00, "video_path");
                    int A0147 = AbstractC37601ox.A01(A00, "video_orig_rotation");
                    int A0148 = AbstractC37601ox.A01(A00, "video_orig_width");
                    int A0149 = AbstractC37601ox.A01(A00, "video_orig_height");
                    int A0150 = AbstractC37601ox.A01(A00, "duration");
                    int A0151 = AbstractC37601ox.A01(A00, DialogModule.KEY_TITLE);
                    int A0152 = AbstractC37601ox.A01(A00, DevServerEntity.COLUMN_DESCRIPTION);
                    int A0153 = AbstractC37601ox.A01(A00, "series_id");
                    int A0154 = AbstractC37601ox.A01(A00, "is_unified_video");
                    int A0155 = AbstractC37601ox.A01(A00, "filter_id");
                    int A0156 = AbstractC37601ox.A01(A00, "filter_strength");
                    int A0157 = AbstractC37601ox.A01(A00, "post_crop_aspect_ratio");
                    int A0158 = AbstractC37601ox.A01(A00, "is_landscape_surface");
                    int A0159 = AbstractC37601ox.A01(A00, "is_over_image_custom");
                    int A0160 = AbstractC37601ox.A01(A00, "cover_image_file_path");
                    int A0161 = AbstractC37601ox.A01(A00, "cover_image_width");
                    int A0162 = AbstractC37601ox.A01(A00, "cover_image_height");
                    int A0163 = AbstractC37601ox.A01(A00, "cover_image_video_time_mx");
                    int A0164 = AbstractC37601ox.A01(A00, "is_cover_image_fram_video_edited");
                    int A0165 = AbstractC37601ox.A01(A00, "is_preview_enabled");
                    int A0166 = AbstractC37601ox.A01(A00, "preview_crop_coords");
                    int A0167 = AbstractC37601ox.A01(A00, "profile_crop_coords");
                    int A0168 = AbstractC37601ox.A01(A00, "is_internal");
                    int A0169 = AbstractC37601ox.A01(A00, "group_destination_user_id");
                    int A0170 = AbstractC37601ox.A01(A00, "share_to_facebook");
                    int A0171 = AbstractC37601ox.A01(A00, "are_captions_enabled");
                    int A0172 = AbstractC37601ox.A01(A00, "are_comments_disabled");
                    int A0173 = AbstractC37601ox.A01(A00, "is_funded_content_deal");
                    int A0174 = AbstractC37601ox.A01(A00, "is_like_and_view_counts_disabled");
                    int A0175 = AbstractC37601ox.A01(A00, "is_paid_partnership");
                    int A0176 = AbstractC37601ox.A01(A00, "branded_content_info");
                    int A0177 = AbstractC37601ox.A01(A00, "partner_boost_enabled");
                    int A0178 = AbstractC37601ox.A01(A00, "shopping_info");
                    int A0179 = AbstractC37601ox.A01(A00, "created_timestamp");
                    int A0180 = AbstractC37601ox.A01(A00, "last_modified_timestamp");
                    if (A00.moveToFirst()) {
                        int i13 = A00.getInt(A0144);
                        boolean z15 = false;
                        if (A00.getInt(A0145) != 0) {
                            z15 = true;
                        }
                        String string24 = A00.getString(A0146);
                        int i14 = A00.getInt(A0147);
                        int i15 = A00.getInt(A0148);
                        int i16 = A00.getInt(A0149);
                        long j2 = A00.getLong(A0150);
                        String string25 = A00.getString(A0151);
                        String string26 = A00.getString(A0152);
                        if (A00.isNull(A0153)) {
                            string7 = null;
                        } else {
                            string7 = A00.getString(A0153);
                        }
                        boolean z16 = false;
                        if (A00.getInt(A0154) != 0) {
                            z16 = true;
                        }
                        int i17 = A00.getInt(A0155);
                        int i18 = A00.getInt(A0156);
                        float f2 = A00.getFloat(A0157);
                        boolean z17 = false;
                        if (A00.getInt(A0158) != 0) {
                            z17 = true;
                        }
                        boolean z18 = false;
                        if (A00.getInt(A0159) != 0) {
                            z18 = true;
                        }
                        if (A00.isNull(A0160)) {
                            string8 = null;
                        } else {
                            string8 = A00.getString(A0160);
                        }
                        int i19 = A00.getInt(A0161);
                        int i20 = A00.getInt(A0162);
                        int i21 = A00.getInt(A0163);
                        boolean z19 = false;
                        if (A00.getInt(A0164) != 0) {
                            z19 = true;
                        }
                        boolean z20 = false;
                        if (A00.getInt(A0165) != 0) {
                            z20 = true;
                        }
                        if (A00.isNull(A0166)) {
                            string9 = null;
                        } else {
                            string9 = A00.getString(A0166);
                        }
                        RectF A007 = OPE.A00(string9);
                        if (A00.isNull(A0167)) {
                            string10 = null;
                        } else {
                            string10 = A00.getString(A0167);
                        }
                        RectF A008 = OPE.A00(string10);
                        boolean z21 = false;
                        if (A00.getInt(A0168) != 0) {
                            z21 = true;
                        }
                        if (A00.isNull(A0169)) {
                            string11 = null;
                        } else {
                            string11 = A00.getString(A0169);
                        }
                        boolean z22 = false;
                        if (A00.getInt(A0170) != 0) {
                            z22 = true;
                        }
                        boolean z23 = false;
                        if (A00.getInt(A0171) != 0) {
                            z23 = true;
                        }
                        boolean z24 = false;
                        if (A00.getInt(A0172) != 0) {
                            z24 = true;
                        }
                        boolean z25 = false;
                        if (A00.getInt(A0173) != 0) {
                            z25 = true;
                        }
                        boolean z26 = false;
                        if (A00.getInt(A0174) != 0) {
                            z26 = true;
                        }
                        boolean z27 = false;
                        if (A00.getInt(A0175) != 0) {
                            z27 = true;
                        }
                        if (A00.isNull(A0176)) {
                            string12 = null;
                        } else {
                            string12 = A00.getString(A0176);
                        }
                        IGTVBrandedContentTags A009 = OPF.A00(string12);
                        boolean z28 = false;
                        if (A00.getInt(A0177) != 0) {
                            z28 = true;
                        }
                        if (A00.isNull(A0178)) {
                            string13 = null;
                        } else {
                            string13 = A00.getString(A0178);
                        }
                        r2 = new C51682MsD(A007, A008, A009, OPG.A00(string13), string24, string25, string26, string7, string8, string11, f2, i13, i14, i15, i16, i17, i18, i19, i20, i21, j2, A00.getLong(A0179), A00.getLong(A0180), z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28);
                    } else {
                        r2 = 0;
                    }
                    A00.close();
                    obj = r2;
                    return obj;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    C1YP c1yp = ((LJY) this.A01).A01;
                    C37581ov c37581ov = (C37581ov) this.A02;
                    Cursor A0010 = C3EP.A00(c1yp, c37581ov, false);
                    try {
                        int A0181 = AbstractC37601ox.A01(A0010, "signal_id");
                        int A0182 = AbstractC37601ox.A01(A0010, "signal_type");
                        int A0183 = AbstractC37601ox.A01(A0010, "item_id");
                        int A0184 = AbstractC37601ox.A01(A0010, "item_type");
                        int A0185 = AbstractC37601ox.A01(A0010, AbstractC43591JPw.A00(214));
                        int A0186 = AbstractC37601ox.A01(A0010, "container_module");
                        int A0187 = AbstractC37601ox.A01(A0010, "inventory_source");
                        int A0188 = AbstractC37601ox.A01(A0010, "signal_status");
                        int A0189 = AbstractC37601ox.A01(A0010, "timestamp");
                        int A0190 = AbstractC37601ox.A01(A0010, "signal_data");
                        int A0191 = AbstractC37601ox.A01(A0010, "meta_idad_id");
                        int A0192 = AbstractC37601ox.A01(A0010, "meta_idcampaign_id");
                        int A0193 = AbstractC37601ox.A01(A0010, "meta_idapp_id");
                        int A0194 = AbstractC37601ox.A01(A0010, "meta_idpage_id");
                        int A0195 = AbstractC37601ox.A01(A0010, "meta_idactor_id");
                        int A0196 = AbstractC37601ox.A01(A0010, "meta_idmedia_id");
                        ArrayList arrayList2 = new ArrayList(A0010.getCount());
                        while (A0010.moveToNext()) {
                            String string27 = A0010.getString(A0181);
                            String string28 = A0010.getString(A0182);
                            String string29 = A0010.getString(A0183);
                            String string30 = A0010.getString(A0184);
                            String string31 = A0010.getString(A0185);
                            String string32 = A0010.getString(A0186);
                            String string33 = A0010.getString(A0187);
                            String string34 = A0010.getString(A0188);
                            C14360o3.A0B(string34, 0);
                            EnumC74603Ws A0011 = AbstractC72646Xjc.A00(string34);
                            long j3 = A0010.getLong(A0189);
                            byte[] blob = A0010.getBlob(A0190);
                            if (A0010.isNull(A0191)) {
                                string = null;
                            } else {
                                string = A0010.getString(A0191);
                            }
                            if (A0010.isNull(A0192)) {
                                string2 = null;
                            } else {
                                string2 = A0010.getString(A0192);
                            }
                            if (A0010.isNull(A0193)) {
                                string3 = null;
                            } else {
                                string3 = A0010.getString(A0193);
                            }
                            if (A0010.isNull(A0194)) {
                                string4 = null;
                            } else {
                                string4 = A0010.getString(A0194);
                            }
                            if (A0010.isNull(A0195)) {
                                string5 = null;
                            } else {
                                string5 = A0010.getString(A0195);
                            }
                            if (A0010.isNull(A0196)) {
                                string6 = null;
                            } else {
                                string6 = A0010.getString(A0196);
                            }
                            arrayList2.add(new C45071Jx0(new C51622MrF(string, string2, string3, string4, string5, string6), A0011, string27, string28, string29, string30, string31, string32, string33, blob, j3));
                        }
                        return arrayList2;
                    } finally {
                        A0010.close();
                        c37581ov.A00();
                    }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void finalize() {
        switch (this.A00) {
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((C37581ov) this.A02).A00();
                return;
            default:
                super.finalize();
                return;
        }
    }
}
