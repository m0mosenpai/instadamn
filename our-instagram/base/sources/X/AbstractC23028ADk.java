package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.ADk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23028ADk {
    public static final AbstractC202988yG A00(Context context, UserSession userSession, EnumC194908jr enumC194908jr, int i) {
        C14360o3.A0B(context, 1);
        switch (enumC194908jr.ordinal()) {
            case 0:
                return new V7B(context, i);
            case 1:
                return new V7D(context, i);
            case 2:
                return new C219769nO(context, i);
            case 3:
                return new V7F(context, i);
            case 4:
                return new V7E(context, i);
            case 5:
                return new V7G(context, userSession, i);
            case 6:
                return new V79(context, i);
            case 7:
                return new V7C(context, i);
            case 8:
                return new C219759nN(context, i);
            case 9:
                return new V7A(context, i);
            case 10:
                return new V7H(context, i);
            case 11:
                return new V7I(context, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new V7J(context, i);
            default:
                throw AbstractC166987dD.A14(AbstractC167017dG.A0n(enumC194908jr, "No animated text drawable created for: ", AbstractC166987dD.A1C()));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC202988yG A01(android.content.Context r2, com.instagram.common.session.UserSession r3, X.C190888ck r4, int r5) {
        /*
            r0 = 1
            X.C14360o3.A0B(r2, r0)
            java.lang.String r1 = r4.A09
            int r0 = r1.hashCode()
            switch(r0) {
                case -2004336740: goto Lc3;
                case -1744775855: goto Lb5;
                case -1726419343: goto La7;
                case -1663019586: goto L99;
                case -1631834134: goto L8b;
                case -1617422471: goto L7d;
                case -1478538163: goto L7a;
                case -988389614: goto L77;
                case -761073575: goto L74;
                case -555649727: goto L71;
                case -409434162: goto L63;
                case -394091697: goto L60;
                case -353089843: goto L5d;
                case -346746060: goto L5a;
                case -282676306: goto L57;
                case -281568951: goto L54;
                case -250076159: goto L51;
                case -148942121: goto L43;
                case -17506012: goto L35;
                case 3347760: goto L27;
                case 3357411: goto L24;
                case 42700686: goto L21;
                case 1443377805: goto L1e;
                case 1738222382: goto L1b;
                case 1838584197: goto L18;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = "No animated text drawable created for: "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r1)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L18:
            java.lang.String r0 = "neon_v2"
            goto L45
        L1b:
            java.lang.String r0 = "ig_deco"
            goto L7f
        L1e:
            java.lang.String r0 = "dynapuff"
            goto L7f
        L21:
            java.lang.String r0 = "ig_poster"
            goto L7f
        L24:
            java.lang.String r0 = "mono"
            goto L7f
        L27:
            java.lang.String r0 = "meme"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.9nO r0 = new X.9nO
            r0.<init>(r2, r5)
            return r0
        L35:
            java.lang.String r0 = "strong_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.V7F r0 = new X.V7F
            r0.<init>(r2, r5)
            return r0
        L43:
            java.lang.String r0 = "ig_signature"
        L45:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.9nN r0 = new X.9nN
            r0.<init>(r2, r5)
            return r0
        L51:
            java.lang.String r0 = "ig_squeeze"
            goto L7f
        L54:
            java.lang.String r0 = "classic_v2"
            goto La9
        L57:
            java.lang.String r0 = "ig_editor"
            goto L7f
        L5a:
            java.lang.String r0 = "alumni_sans"
            goto L7f
        L5d:
            java.lang.String r0 = "ig_bubble"
            goto L7f
        L60:
            java.lang.String r0 = "poppins"
            goto L7f
        L63:
            java.lang.String r0 = "typewriter_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.V7D r0 = new X.V7D
            r0.<init>(r2, r5)
            return r0
        L71:
            java.lang.String r0 = "modern_refreshed_v2"
            goto Lc5
        L74:
            java.lang.String r0 = "hepta_slab"
            goto L7f
        L77:
            java.lang.String r0 = "ig_literature"
            goto Lb7
        L7a:
            java.lang.String r0 = "halloween"
            goto L7f
        L7d:
            java.lang.String r0 = "caprasimo"
        L7f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.V7A r0 = new X.V7A
            r0.<init>(r2, r5)
            return r0
        L8b:
            java.lang.String r0 = "directional"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.V7C r0 = new X.V7C
            r0.<init>(r2, r5)
            return r0
        L99:
            java.lang.String r0 = "elegant"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.V7E r0 = new X.V7E
            r0.<init>(r2, r5)
            return r0
        La7:
            java.lang.String r0 = "ig_classic"
        La9:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.V7B r0 = new X.V7B
            r0.<init>(r2, r5)
            return r0
        Lb5:
            java.lang.String r0 = "literature"
        Lb7:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.V79 r0 = new X.V79
            r0.<init>(r2, r5)
            return r0
        Lc3:
            java.lang.String r0 = "modern_v2"
        Lc5:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            X.V7G r0 = new X.V7G
            r0.<init>(r2, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23028ADk.A01(android.content.Context, com.instagram.common.session.UserSession, X.8ck, int):X.8yG");
    }
}
