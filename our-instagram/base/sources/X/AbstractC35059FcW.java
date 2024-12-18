package X;

import android.os.Bundle;

/* renamed from: X.FcW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35059FcW {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EN8 A00(android.os.Bundle r3, X.InterfaceC37196Ga7 r4, com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r5) {
        /*
            X.EN8 r1 = new X.EN8
            r1.<init>()
            java.lang.String r0 = "GroupPreviewFragment.INVITE_LINK_SOURCE_KEY"
            java.lang.String r2 = r3.getString(r0)
            if (r2 == 0) goto L14
            int r0 = r2.hashCode()
            switch(r0) {
                case -1711269324: goto L68;
                case -1362237225: goto L65;
                case -833802316: goto L5a;
                case -443204946: goto L4f;
                case -334510404: goto L44;
                case 100344454: goto L39;
                case 906349059: goto L2e;
                case 1780466565: goto L23;
                default: goto L14;
            }
        L14:
            X.Ep6 r2 = X.EnumC33373Ep6.A0L
        L16:
            java.lang.String r0 = "GroupPreviewFragment.JOINING_SURFACE"
            r3.putSerializable(r0, r2)
            r1.setArguments(r3)
            r1.A0C = r4
            r1.A0D = r5
            return r1
        L23:
            java.lang.String r0 = "note_chat"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            X.Ep6 r2 = X.EnumC33373Ep6.A0E
            goto L16
        L2e:
            java.lang.String r0 = "channel_link_xma"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            X.Ep6 r2 = X.EnumC33373Ep6.A0B
            goto L16
        L39:
            java.lang.String r0 = "inbox"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            X.Ep6 r2 = X.EnumC33373Ep6.A0A
            goto L16
        L44:
            java.lang.String r0 = "stories_netego"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            X.Ep6 r2 = X.EnumC33373Ep6.A0K
            goto L16
        L4f:
            java.lang.String r0 = "inbox_channel_invitation"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            X.Ep6 r2 = X.EnumC33373Ep6.A07
            goto L16
        L5a:
            java.lang.String r0 = "channel_link_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            X.Ep6 r2 = X.EnumC33373Ep6.A03
            goto L16
        L65:
            java.lang.String r0 = "user_profile_header"
            goto L6a
        L68:
            java.lang.String r0 = "channel_link_bottom_sheet"
        L6a:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            X.Ep6 r2 = X.EnumC33373Ep6.A0H
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35059FcW.A00(android.os.Bundle, X.Ga7, com.instagram.direct.request.response.GroupLinkPreviewResponse$Success):X.EN8");
    }

    public static final EN8 A01(EnumC33373Ep6 enumC33373Ep6, InterfaceC37196Ga7 interfaceC37196Ga7, String str, String str2) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("GroupPreviewFragment.GROUP_LINK_HASH", str);
        A0b.putSerializable("GroupPreviewFragment.JOINING_SURFACE", enumC33373Ep6);
        A0b.putString("GroupPreviewFragment.SC_INVITE_ID", str2);
        EN8 en8 = new EN8();
        en8.setArguments(A0b);
        en8.A0C = interfaceC37196Ga7;
        return en8;
    }

    public static final EN8 A02(EnumC33373Ep6 enumC33373Ep6, InterfaceC37196Ga7 interfaceC37196Ga7, String str, String str2, String str3) {
        AbstractC167017dG.A1N(str, str2);
        EN8 en8 = new EN8();
        en8.A0C = interfaceC37196Ga7;
        en8.setArguments(AbstractC167027dH.A09("GroupPreviewFragment.JOINING_SURFACE", enumC33373Ep6, AbstractC166987dD.A1L("GroupPreviewFragment.SC_INVITE_ID", str3), AbstractC166987dD.A1L("GroupPreviewFragment.PINNED_SSC_THREAD_ID", str), AbstractC166987dD.A1L("GroupPreviewFragment.FAN_CLUB_ID", str2)));
        return en8;
    }
}
