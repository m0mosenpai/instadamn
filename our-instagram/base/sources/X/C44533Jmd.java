package X;

import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jmd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44533Jmd extends AbstractC52922bZ {
    public final AvatarStickerGraphQLRepository A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final C05A A04;

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C60496R0w r16, X.C44533Jmd r17) {
        /*
            r2 = 0
            if (r16 == 0) goto La8
            X.R0v r0 = r16.A0E()
            if (r0 == 0) goto La8
            X.R0u r0 = r0.A0E()
            if (r0 == 0) goto La8
            X.R0t r0 = r0.A0E()
            if (r0 == 0) goto La8
            com.google.common.collect.ImmutableList r1 = r0.A0E()
            if (r1 == 0) goto La8
            r0 = 0
            java.lang.Object r4 = X.AbstractC001800i.A0O(r1, r0)
            X.2JS r4 = (X.C2JS) r4
        L22:
            r3 = r17
            X.05A r6 = r3.A04
            r13 = 1
            if (r4 == 0) goto La6
            java.lang.String r0 = "id"
            java.lang.String r10 = r4.A07(r0)
        L2f:
            java.lang.String r7 = ""
            r14 = r7
            if (r10 != 0) goto L35
            r10 = r7
        L35:
            if (r4 == 0) goto L3f
            java.lang.String r0 = "cdn_url"
            java.lang.String r11 = r4.getOptionalStringField(r13, r0)
            if (r11 != 0) goto L91
        L3f:
            r11 = r7
            if (r4 != 0) goto L91
            r9 = r2
            r12 = r2
        L44:
            X.L3j r8 = new X.L3j
            r8.<init>(r9, r10, r11, r12, r13)
            r6.Egh(r8)
            if (r4 == 0) goto L61
            java.lang.String r0 = "cdn_url"
            java.lang.String r0 = r4.getOptionalStringField(r13, r0)
            if (r0 == 0) goto L57
            r7 = r0
        L57:
            X.KdE r2 = X.EnumC46238KdE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 10
            java.lang.String r0 = "media_type"
            java.lang.Enum r2 = r4.getOptionalEnumField(r1, r0, r2)
        L61:
            X.6lx r0 = X.C148276lx.A1d
            java.lang.String r13 = r3.A03
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.AbstractC25225BEi.A0t(r7)
            r15 = 1142292480(0x44160000, float:600.0)
            r17 = 1056964608(0x3f000000, float:0.5)
            r16 = r15
            X.6ly r0 = X.C148286ly.A00(r12, r13, r14, r15, r16, r17)
            java.util.List r1 = X.AbstractC166987dD.A1J(r0)
            X.KdE r0 = X.EnumC46238KdE.CLIP
            if (r2 != r0) goto L8e
            X.6pU r0 = X.EnumC150226pU.A0A
        L7d:
            X.6lx r2 = new X.6lx
            r2.<init>(r0, r13, r1)
            com.instagram.avatars.graphql.AvatarStickerGraphQLRepository r0 = r3.A00
            X.6bK r0 = r0.A01
            java.lang.String r1 = r2.A0Z
            android.util.LruCache r0 = r0.A00
            r0.put(r1, r2)
            return
        L8e:
            X.6pU r0 = X.EnumC150226pU.A0C
            goto L7d
        L91:
            X.KdE r5 = X.EnumC46238KdE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 10
            java.lang.String r0 = "media_type"
            java.lang.Enum r9 = r4.getOptionalEnumField(r1, r0, r5)
            X.KdE r9 = (X.EnumC46238KdE) r9
            r1 = 9
            java.lang.String r0 = "accessibility_label"
            java.lang.String r12 = r4.getOptionalStringField(r1, r0)
            goto L44
        La6:
            r10 = r2
            goto L2f
        La8:
            r4 = r2
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44533Jmd.A00(X.R0w, X.Jmd):void");
    }

    public C44533Jmd(AvatarStickerGraphQLRepository avatarStickerGraphQLRepository, UserSession userSession, String str, String str2) {
        AbstractC25234BEr.A1P(userSession, str, avatarStickerGraphQLRepository);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = avatarStickerGraphQLRepository;
        this.A04 = AbstractC25225BEi.A1H(new C47676L3j(EnumC46238KdE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "", "", null, false));
    }
}
