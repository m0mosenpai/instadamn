package com.instagram.share.facebook;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC31175DnJ;
import X.B4Z;
import X.C0eB;
import X.C12L;
import X.C12T;
import X.C14360o3;
import X.C194848jk;
import X.C1JX;
import X.C1ON;
import X.C25621Ms;
import X.C3NX;
import X.C40781ul;
import X.C46552Bt;
import X.C55702hA;
import X.InterfaceC11380iw;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.PZ2;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.share.facebook.ReelsShareToFacebookUtils$toggleXarAllReels$1", f = "ReelsShareToFacebookUtils.kt", i = {}, l = {436, 438}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ReelsShareToFacebookUtils$toggleXarAllReels$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C46552Bt A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsShareToFacebookUtils$toggleXarAllReels$1(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C46552Bt c46552Bt, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A05 = z;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c46552Bt;
        this.A06 = z2;
        this.A04 = interfaceC16820sZ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z = this.A05;
        UserSession userSession = this.A02;
        return new ReelsShareToFacebookUtils$toggleXarAllReels$1(this.A01, userSession, this.A03, interfaceC23621Ds, this.A04, z, this.A06);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            }
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            boolean z = this.A05;
            UserSession userSession = this.A02;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            if (interfaceC11380iw != null) {
                str = interfaceC11380iw.getModuleName();
            } else {
                str = null;
            }
            C14360o3.A0B(userSession, 1);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("clips/user/set_default_share_to_fb_enabled/");
            A0c.A0I("default_share_to_fb_enabled", z);
            A0c.A9s("sharing_mode", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A0c.A9s("container_module", str);
            A0c.A9s("enable_oa_reuse_on_fb", "true");
            C1ON A0D = AbstractC31175DnJ.A0D(A0c, C40781ul.class, C55702hA.class, true);
            this.A00 = 1;
            obj = A0D.A00(1677891942, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        C46552Bt c46552Bt = this.A03;
        boolean z2 = this.A06;
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        UserSession userSession2 = this.A02;
        if (!(obj instanceof C3NX)) {
            if (obj instanceof C194848jk) {
                C12T c12t = C12L.A00.A04;
                PZ2 pz2 = new PZ2(c46552Bt, interfaceC16820sZ, userSession2, null, 3, z2);
                this.A00 = 2;
                if (AbstractC23641Du.A00(this, c12t, pz2) == c1jx) {
                    return c1jx;
                }
            } else {
                throw B4Z.A00();
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReelsShareToFacebookUtils$toggleXarAllReels$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
