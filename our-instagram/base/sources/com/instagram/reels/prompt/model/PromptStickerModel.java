package com.instagram.reels.prompt.model;

import X.AbstractC13950nL;
import X.AbstractC148296lz;
import X.AbstractC16960so;
import X.AbstractC53242c7;
import X.C00O;
import X.C05F;
import X.C14360o3;
import X.C148276lx;
import X.C16930sl;
import X.C1QI;
import X.C37761pD;
import X.C5NG;
import X.C5NH;
import X.C5NL;
import X.C69669VtA;
import X.C9Ay;
import X.EnumC150226pU;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.R;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class PromptStickerModel implements Parcelable, C5NL {
    public static final Parcelable.Creator CREATOR = new C9Ay(56);
    public StoryPromptTappableDataIntf A00;
    public final int A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (r7.A00.Bio() == com.instagram.api.schemas.StoryPromptType.A0B) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        if (r5 != X.C9H2.A02) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
    
        if (r5 != X.C9H2.A03) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        if (X.AbstractC207699Gz.A00(r6) != X.C9H2.A02) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0136, code lost:
    
        if (r1 != true) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PromptStickerModel(com.instagram.api.schemas.StoryPromptTappableDataIntf r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.prompt.model.PromptStickerModel.<init>(com.instagram.api.schemas.StoryPromptTappableDataIntf):void");
    }

    public final void A0C(List list) {
        C14360o3.A0B(list, 0);
        C69669VtA AKZ = this.A00.AKZ();
        AKZ.A0R = list;
        this.A00 = AKZ.A00();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int A01(Context context) {
        int A01;
        int i;
        StoryPromptType Bio = this.A00.Bio();
        if (Bio != null) {
            int ordinal = Bio.ordinal();
            if (ordinal != 7 && ordinal != 6) {
                if (ordinal != 9) {
                    if (ordinal == 5) {
                        i = R.attr.igds_color_creation_tools_grey_09;
                    }
                } else {
                    i = R.attr.igds_color_creation_tools_purple;
                }
            } else {
                i = R.attr.igds_color_creation_tools_pink;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                A01 = AbstractC53242c7.A0H(context, valueOf.intValue());
                return context.getColor(A01);
            }
        }
        A01 = C1QI.A01(context);
        return context.getColor(A01);
    }

    public final StoryPromptTappableData A02() {
        return this.A00.F1M(new C37761pD(null));
    }

    public final StoryPromptType A03() {
        StoryPromptType Bio = this.A00.Bio();
        if (Bio == null) {
            return StoryPromptType.A05;
        }
        return Bio;
    }

    public final String A05() {
        String mediaId = this.A00.getMediaId();
        if (mediaId == null) {
            return "";
        }
        return mediaId;
    }

    public final LinkedHashMap A06() {
        long j;
        long j2;
        StoryTemplateAssetDictIntf C5d;
        List C2J;
        List C1H;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String obj = EnumC150226pU.A1i.toString();
        StoryTemplateDictIntf C2N = this.A00.C2N();
        long j3 = 0;
        if (C2N != null && (C1H = C2N.C1H()) != null) {
            j = C1H.size();
        } else {
            j = 0;
        }
        linkedHashMap.put(obj, Long.valueOf(j));
        String obj2 = EnumC150226pU.A0f.toString();
        StoryTemplateDictIntf C2N2 = this.A00.C2N();
        if (C2N2 != null && (C2J = C2N2.C2J()) != null) {
            int i = 0;
            if (!(C2J instanceof Collection) || !C2J.isEmpty()) {
                Iterator it = C2J.iterator();
                while (it.hasNext()) {
                    if (C14360o3.A0K(((StoryTemplateStaticOverlayDictIntf) it.next()).C0o(), "gif") && (i = i + 1) < 0) {
                        AbstractC16960so.A1T();
                        throw C00O.createAndThrow();
                    }
                }
            }
            j2 = i;
        } else {
            j2 = 0;
        }
        linkedHashMap.put(obj2, Long.valueOf(j2));
        String obj3 = EnumC150226pU.A0c.toString();
        StoryTemplateDictIntf C2N3 = this.A00.C2N();
        if (C2N3 != null && (C5d = C2N3.C5d()) != null && C5d.BGx() != null) {
            j3 = 1;
        }
        linkedHashMap.put(obj3, Long.valueOf(j3));
        return linkedHashMap;
    }

    public final void A07(StoryTemplateDictIntf storyTemplateDictIntf) {
        C69669VtA AKZ = this.A00.AKZ();
        AKZ.A07 = storyTemplateDictIntf;
        this.A00 = AKZ.A00();
    }

    public final void A09(String str) {
        C69669VtA AKZ = this.A00.AKZ();
        AKZ.A0L = str;
        this.A00 = AKZ.A00();
    }

    public final void A0A(String str) {
        C69669VtA AKZ = this.A00.AKZ();
        AKZ.A0P = str;
        this.A00 = AKZ.A00();
    }

    public final void A0B(String str) {
        C69669VtA AKZ = this.A00.AKZ();
        if (str == null) {
            str = "";
        }
        AKZ.A0Q = str;
        this.A00 = AKZ.A00();
    }

    public final boolean A0D() {
        StoryTemplateDictIntf C2N = this.A00.C2N();
        if (C2N != null && C2N.BVo() != null) {
            return true;
        }
        return false;
    }

    public final boolean A0E() {
        List list;
        StoryTemplateDictIntf C2N = this.A00.C2N();
        if (C2N != null) {
            list = C2N.C2J();
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((StoryTemplateStaticOverlayDictIntf) it.next()).C0o().equals("gif")) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0F() {
        if (this.A00.Bio() != StoryPromptType.A09) {
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        if (this.A00.Bio() != StoryPromptType.A04) {
            return false;
        }
        return true;
    }

    public final boolean A0H() {
        return C14360o3.A0K(this.A00.CRP(), true);
    }

    public final boolean A0I() {
        CameraTool cameraTool;
        if (this.A0B) {
            GenAIToolInfoDictIntf B9Z = this.A00.B9Z();
            if (B9Z != null) {
                cameraTool = B9Z.C9G();
            } else {
                cameraTool = null;
            }
            if (cameraTool == CameraTool.A1i) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0J() {
        if (!C14360o3.A0K(this.A00.C0j(), "backdrop_sticker_default") && !C14360o3.A0K(this.A00.C0j(), "restyle_sticker_default") && !C14360o3.A0K(this.A00.C0j(), "backdrop_sticker_with_facepile_style") && !C14360o3.A0K(this.A00.C0j(), "restyle_sticker_with_facepile_style") && !C14360o3.A0K(this.A00.C0j(), "add_yours_backdrop_sticker_default")) {
            return false;
        }
        return true;
    }

    public final boolean A0K() {
        return C14360o3.A0K(this.A00.CaL(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0L() {
        /*
            r2 = this;
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto Lb
            boolean r1 = X.AbstractC001900j.A0T(r0)
            r0 = 0
            if (r1 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.prompt.model.PromptStickerModel.A0L():boolean");
    }

    public final boolean A0M() {
        if (this.A00.Bio() != StoryPromptType.A0G) {
            return false;
        }
        return true;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C148276lx c148276lx;
        List singletonList;
        EnumC150226pU enumC150226pU;
        String str;
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A06;
        if (A0H()) {
            C148276lx c148276lx2 = C148276lx.A0a;
            enumC150226pU = EnumC150226pU.A0I;
            str = "clips_prompt_sticker_bundle_id";
        } else {
            if (this.A00.Bio() != StoryPromptType.A0A && this.A00.Bio() != StoryPromptType.A09) {
                if (this.A00.Bio() == StoryPromptType.A0C) {
                    c148276lx = C148276lx.A17;
                } else if (this.A00.Bio() == StoryPromptType.A08) {
                    c148276lx = C148276lx.A0x;
                } else {
                    C148276lx c148276lx3 = C148276lx.A0a;
                    enumC150226pU = EnumC150226pU.A1H;
                    str = "prompt_sticker_bundle_id";
                }
            } else {
                c148276lx = C148276lx.A16;
            }
            singletonList = Collections.singletonList(c148276lx.A0Z);
            C14360o3.A07(singletonList);
            c5ng.A06 = singletonList;
            return c5ng;
        }
        singletonList = AbstractC148296lz.A06(enumC150226pU, str).A01();
        c5ng.A06 = singletonList;
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        if (this.A0D) {
            return C05F.A0y;
        }
        if (this.A0C) {
            return C05F.A13;
        }
        if (this.A0B) {
            return C05F.A16;
        }
        if (this.A0A) {
            return C05F.A14;
        }
        if (A0H()) {
            return C05F.A0M;
        }
        if (A0G()) {
            return C05F.A0O;
        }
        return C05F.A0L;
    }

    public final int A00() {
        if (A0J()) {
            return -1;
        }
        return AbstractC13950nL.A0C(this.A00.getBackgroundColor(), -1);
    }

    public final PromptStickerModel A04() {
        return new PromptStickerModel(new C69669VtA(A02()).A00());
    }

    public final void A08(User user) {
        ArrayList A1N = AbstractC16960so.A1N(user);
        A1N.addAll(this.A00.B48());
        A0C(A1N);
        int BbW = this.A00.BbW() + 1;
        C69669VtA AKZ = this.A00.AKZ();
        AKZ.A00 = BbW;
        this.A00 = AKZ.A00();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PromptStickerModel(com.instagram.api.schemas.GenAIToolInfoDict r36, com.instagram.api.schemas.StoryPromptType r37, com.instagram.user.model.User r38, java.lang.Integer r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.util.List r45, int r46, int r47, boolean r48, boolean r49, boolean r50) {
        /*
            r35 = this;
            r32 = r42
            r5 = 0
            r7 = 0
            r0 = 1
            r2 = r40
            X.C14360o3.A0B(r2, r0)
            r0 = 4
            r1 = r45
            X.C14360o3.A0B(r1, r0)
            r0 = 14
            r6 = r39
            X.C14360o3.A0B(r6, r0)
            java.lang.String r0 = java.lang.String.valueOf(r47)
            com.instagram.api.schemas.StoryPromptDisablementState r9 = X.AbstractC109304vw.A00(r0)
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.A04
            r4 = 1
            r3 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)
            r12 = r37
            if (r12 != r0) goto L2c
            r3 = 1
        L2c:
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.A0F
            if (r12 == r0) goto L31
            r4 = 0
        L31:
            if (r42 != 0) goto L35
            java.lang.String r32 = ""
        L35:
            int r0 = r6.intValue()
            if (r0 == 0) goto L7b
            java.lang.String r30 = "clips_creator_invite"
        L3d:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r48)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r49)
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r50)
            com.instagram.api.schemas.StoryPromptTappableData r6 = new com.instagram.api.schemas.StoryPromptTappableData
            r8 = r36
            r14 = r38
            r29 = r41
            r27 = r43
            r31 = r44
            r34 = r46
            r10 = r7
            r11 = r7
            r13 = r7
            r18 = r15
            r19 = r15
            r20 = r15
            r22 = r15
            r25 = r15
            r26 = r15
            r28 = r2
            r33 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r35
            r0.<init>(r6)
            return
        L7b:
            java.lang.String r30 = ""
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.prompt.model.PromptStickerModel.<init>(com.instagram.api.schemas.GenAIToolInfoDict, com.instagram.api.schemas.StoryPromptType, com.instagram.user.model.User, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PromptStickerModel() {
        /*
            r16 = this;
            r1 = 0
            java.lang.String r5 = ""
            X.0sl r10 = X.C16930sl.A00
            r11 = 0
            java.lang.Integer r4 = X.C05F.A00
            com.instagram.api.schemas.StoryPromptType r2 = com.instagram.api.schemas.StoryPromptType.A05
            r0 = r16
            r3 = r1
            r6 = r5
            r7 = r1
            r8 = r1
            r9 = r1
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.prompt.model.PromptStickerModel.<init>():void");
    }
}
