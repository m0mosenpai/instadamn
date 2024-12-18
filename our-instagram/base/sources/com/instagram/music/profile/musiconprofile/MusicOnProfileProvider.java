package com.instagram.music.profile.musiconprofile;

import X.AbstractC09440dt;
import X.AbstractC13670mt;
import X.AbstractC155496ye;
import X.AbstractC37941Gme;
import X.C00O;
import X.C05F;
import X.C14360o3;
import X.C155506yf;
import X.C1GL;
import X.C1ON;
import X.C1P1;
import X.C25621Ms;
import X.C2GS;
import X.C2GT;
import X.C37938Gmb;
import X.C37940Gmd;
import X.C9EA;
import X.H95;
import X.InterfaceC09390do;
import X.InterfaceC43474JIm;
import X.MWW;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MusicOnProfileProvider {
    public boolean A00;
    public final C2GS A01;
    public final UserSession A02;
    public final Map A03;
    public final Map A04;
    public final InterfaceC09390do A05;
    public final MusicOnProfileRepository A06;
    public final C155506yf A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2GT, X.2GS] */
    public MusicOnProfileProvider(UserSession userSession, MusicOnProfileRepository musicOnProfileRepository) {
        C14360o3.A0B(musicOnProfileRepository, 2);
        this.A02 = userSession;
        this.A06 = musicOnProfileRepository;
        this.A01 = new C2GT(null);
        this.A05 = AbstractC09440dt.A01(new C9EA(this, 33));
        this.A03 = new LinkedHashMap();
        this.A04 = new LinkedHashMap();
        this.A07 = AbstractC155496ye.A00(userSession);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r4 = 7
            boolean r0 = X.C57145PWx.A02(r7, r4)
            if (r0 == 0) goto L9a
            r3 = r7
            X.PWx r3 = (X.C57145PWx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r2 = r3.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L88
            if (r0 != r5) goto La7
            java.lang.Object r4 = r3.A01
            com.instagram.music.profile.musiconprofile.MusicOnProfileProvider r4 = (com.instagram.music.profile.musiconprofile.MusicOnProfileProvider) r4
            X.AbstractC09560e7.A00(r2)
        L27:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L7e
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r3 = r4.A02
            com.instagram.user.model.User r2 = r0.A01(r3)
            r0 = 0
            X.17P r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.EVU(r0)
            X.1My r1 = X.AbstractC25651Mw.A00(r3)
            X.2AS r0 = new X.2AS
            r0.<init>(r2)
            r1.E4s(r0)
            X.0do r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L76
            java.lang.String r0 = r2.getId()
            r4.A04(r1, r0)
        L5f:
            X.0eB r0 = X.C0eB.A00
            X.3NX r2 = new X.3NX
            r2.<init>(r0)
        L66:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L75
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto La1
            X.0eB r0 = X.C0eB.A00
            X.8jk r2 = new X.8jk
            r2.<init>(r0)
        L75:
            return r2
        L76:
            r4.A00 = r5
            X.2GS r0 = r4.A01
            r0.A0A(r1)
            goto L5f
        L7e:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L66
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L88:
            X.AbstractC09560e7.A00(r2)
            com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository r0 = r6.A06
            r3.A01 = r6
            r3.A00 = r5
            java.lang.Object r2 = r0.A01(r3)
            if (r2 != r1) goto L98
            return r1
        L98:
            r4 = r6
            goto L27
        L9a:
            X.PWx r3 = new X.PWx
            r3.<init>(r6, r7, r4)
            goto L15
        La1:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        La7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.profile.musiconprofile.MusicOnProfileProvider.A02(X.1Ds):java.lang.Object");
    }

    public final void A03(C1P1 c1p1, C1GL c1gl, String str) {
        C25621Ms c25621Ms = new C25621Ms(this.A06.A00, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B(AbstractC13670mt.A06("music/profile/%s/", str));
        c25621Ms.A0P(null, H95.class, C37938Gmb.class, false);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        c1gl.schedule(A0N);
    }

    public static final MWW A00(H95 h95) {
        InterfaceC43474JIm interfaceC43474JIm = h95.A01;
        if (interfaceC43474JIm == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        MusicInfoImpl musicInfoImpl = ((C37940Gmd) interfaceC43474JIm).A00;
        Integer Adg = musicInfoImpl.A01.Adg();
        if (Adg != null) {
            int intValue = Adg.intValue();
            MusicConsumptionModel musicConsumptionModel = musicInfoImpl.A01;
            Integer BaR = musicConsumptionModel.BaR();
            if (BaR != null) {
                int intValue2 = BaR.intValue();
                MusicAssetModel A00 = AbstractC37941Gme.A00(musicInfoImpl.A00);
                if (A00 != null) {
                    String derivedContentId = musicConsumptionModel.getDerivedContentId();
                    if (derivedContentId != null) {
                        return new MWW(A00, derivedContentId, intValue, intValue2);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.MWW r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r4 = 8
            boolean r0 = X.C57145PWx.A02(r9, r4)
            if (r0 == 0) goto Lbb
            r3 = r9
            X.PWx r3 = (X.C57145PWx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbb
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r2 = r3.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto La8
            if (r0 != r5) goto Lc8
            java.lang.Object r4 = r3.A01
            com.instagram.music.profile.musiconprofile.MusicOnProfileProvider r4 = (com.instagram.music.profile.musiconprofile.MusicOnProfileProvider) r4
            X.AbstractC09560e7.A00(r2)
        L28:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L9e
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r3 = r2.A00
            X.MWW r3 = (X.MWW) r3
            X.6yf r2 = r4.A07
            com.instagram.common.session.UserSession r6 = r4.A02
            java.lang.String r1 = r6.userId
            java.lang.String r0 = "save_profile_music_successful"
            r2.A08(r1, r0)
            X.0sy r0 = X.C08730cb.A00(r6)
            com.instagram.user.model.User r2 = r0.A00()
            X.17P r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.EVU(r0)
            X.1My r1 = X.AbstractC25651Mw.A00(r6)
            X.2AS r0 = new X.2AS
            r0.<init>(r2)
            r1.E4s(r0)
            X.0do r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L96
            java.lang.String r0 = r2.getId()
            r4.A04(r3, r0)
        L71:
            X.3NX r2 = new X.3NX
            r2.<init>(r3)
        L76:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L95
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto Lc2
            X.6yf r3 = r4.A07
            com.instagram.common.session.UserSession r2 = r4.A02
            java.lang.String r0 = r2.userId
            java.lang.String r1 = "save_profile_music_error"
            r3.A08(r0, r1)
            java.lang.String r0 = r2.userId
            r3.A07(r0, r1)
            X.0eB r0 = X.C0eB.A00
            X.8jk r2 = new X.8jk
            r2.<init>(r0)
        L95:
            return r2
        L96:
            r4.A00 = r5
            X.2GS r0 = r4.A01
            r0.A0A(r3)
            goto L71
        L9e:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L76
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        La8:
            X.AbstractC09560e7.A00(r2)
            com.instagram.music.profile.musiconprofile.repository.MusicOnProfileRepository r0 = r7.A06
            r3.A01 = r7
            r3.A00 = r5
            java.lang.Object r2 = r0.A00(r8, r3)
            if (r2 != r1) goto Lb8
            return r1
        Lb8:
            r4 = r7
            goto L28
        Lbb:
            X.PWx r3 = new X.PWx
            r3.<init>(r7, r9, r4)
            goto L16
        Lc2:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lc8:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.profile.musiconprofile.MusicOnProfileProvider.A01(X.MWW, X.1Ds):java.lang.Object");
    }

    public final void A04(MWW mww, String str) {
        this.A03.put(str, Long.valueOf(System.currentTimeMillis()));
        this.A04.put(str, mww);
    }
}
