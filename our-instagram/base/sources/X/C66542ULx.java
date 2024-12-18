package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.LocationSharingPresenterState;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.ULx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66542ULx extends AbstractC66543ULy {
    public static final C66537ULs A0M = new Object();
    public final Handler A00;
    public final C7CW A01;
    public final C69632VsZ A02;
    public final C69108Vhy A03;
    public final C7CY A04;
    public final C62967SZk A05;
    public final W91 A06;
    public final Runnable A07;
    public final Runnable A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final WUC A0F;
    public final InterfaceC65636Tpx A0G;
    public final InterfaceC65636Tpx A0H;
    public final V7T A0I;
    public final USA A0J;
    public final USB A0K;
    public final boolean A0L;

    public final void A09() {
        LiveLocationSession liveLocationSession = A00(this).A03;
        if (liveLocationSession == null) {
            AbstractC66543ULy.A04(this, null, "LIVE_LOCATION_STOPPED");
        } else {
            A03(this, liveLocationSession, true);
        }
    }

    public final void A0B(Bundle bundle) {
        C69769Vv6 c69769Vv6;
        Parcelable parcelable;
        ((AbstractC68892Vdo) this).A00 = true;
        AbstractC66543ULy.A05(this, "attach", new Object[0]);
        if (bundle != null && (parcelable = bundle.getParcelable("location_sharing_presenter_state")) != null) {
            c69769Vv6 = new C69769Vv6(A0M, parcelable, null, false);
        } else {
            c69769Vv6 = null;
        }
        AbstractC66543ULy.A05(this, "restored_state=%s", c69769Vv6);
        if (c69769Vv6 == null) {
            W3K w3k = new W3K();
            w3k.A01 = System.currentTimeMillis();
            w3k.A0D = false;
            String str = this.A0E;
            w3k.A0C = str;
            AbstractC63311ShH.A04(str, "userId");
            w3k.A04 = this.A02.A00();
            c69769Vv6 = new C69769Vv6(A0M, new LocationSharingPresenterState(w3k), null, false);
        }
        ((AbstractC66543ULy) this).A00 = c69769Vv6;
        AbstractC68891Vdn abstractC68891Vdn = super.A02;
        Calendar.getInstance().getTimeInMillis();
        AbstractC66543ULy.A04(this, null, "LOADING");
        this.A00.postDelayed(this.A08, 10000L);
        USB usb = this.A0K;
        InterfaceC65636Tpx interfaceC65636Tpx = this.A0G;
        ((AbstractC69673VtI) usb).A00.add(interfaceC65636Tpx);
        usb.A00.BuS(interfaceC65636Tpx, ((AbstractC66541ULw) usb).A00);
        USA usa = this.A0J;
        WUC wuc = this.A0F;
        ((AbstractC69673VtI) usa).A00.add(wuc);
        usa.A00.AYs(wuc, ((AbstractC66541ULw) usa).A00);
        if (!abstractC68891Vdn.A00) {
            abstractC68891Vdn.A00 = true;
        }
    }

    public final void A0C(ImmutableList immutableList) {
        if (((AbstractC68892Vdo) this).A00) {
            AbstractC66543ULy.A04(this, immutableList, "POINTS_OF_INTEREST_UPDATED");
            if (((AbstractC68892Vdo) this).A00 && 0 < A00(this).A07.size()) {
                AbstractC66543ULy.A04(this, 0, "POINTS_OF_INTEREST_SELECTED");
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66542ULx(android.content.Context r15, X.XGm r16, com.instagram.common.session.UserSession r17, X.C68746VbP r18, X.V7T r19, X.C69108Vhy r20, X.C7CR r21, com.instagram.model.direct.DirectShareTarget r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28) {
        /*
            r14 = this;
            X.W8s r11 = new X.W8s
            r4 = r27
            r11.<init>(r4)
            X.ULr r9 = new X.ULr
            r9.<init>()
            r2 = r22
            if (r22 == 0) goto Ldb
            java.lang.String r0 = r2.A08()
        L14:
            X.Wf3 r12 = new X.Wf3
            r3 = r17
            r12.<init>(r3, r0)
            r1 = r26
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r13 = "LocationSharingPresenter"
            if (r0 != 0) goto L2b
            r0 = 46
            java.lang.String r13 = X.AnonymousClass001.A0T(r1, r13, r0)
        L2b:
            r8 = r14
            r10 = r16
            r8.<init>(r9, r10, r11, r12, r13)
            X.Wqd r0 = new X.Wqd
            r0.<init>(r14)
            r14.A08 = r0
            X.Wqe r0 = new X.Wqe
            r0.<init>(r14)
            r14.A07 = r0
            X.Wqf r0 = new X.Wqf
            r0.<init>(r14)
            r14.A0A = r0
            X.Wqg r0 = new X.Wqg
            r0.<init>(r14)
            r14.A09 = r0
            r1 = 1
            X.WUB r0 = new X.WUB
            r0.<init>(r14, r1)
            r14.A0G = r0
            X.ULu r0 = new X.ULu
            r0.<init>(r14)
            r14.A0F = r0
            r1 = 2
            X.WUB r0 = new X.WUB
            r0.<init>(r14, r1)
            r14.A0H = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r14.A00 = r0
            r6 = r23
            r14.A0B = r6
            r14.A0E = r4
            r0 = r24
            r14.A0C = r0
            r0 = r25
            r14.A0D = r0
            X.VsZ r0 = new X.VsZ
            r0.<init>(r15, r3)
            r14.A02 = r0
            X.SZk r0 = new X.SZk
            r0.<init>(r15, r3, r2)
            r14.A05 = r0
            r5 = r20
            r14.A03 = r5
            r0 = 49
            X.MHM r1 = new X.MHM
            r1.<init>(r3, r0)
            java.lang.Class<X.7CY> r0 = X.C7CY.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.7CY r0 = (X.C7CY) r0
            r14.A04 = r0
            r7 = r21
            X.7CX r0 = r7.A00()
            r14.A01 = r0
            X.7CT r4 = r7.A00
            java.util.concurrent.Executor r2 = r7.A01
            java.util.concurrent.Executor r0 = r7.A02
            X.WWf r1 = new X.WWf
            r1.<init>(r4, r2, r0)
            X.USB r0 = new X.USB
            r0.<init>(r1, r3, r6)
            r14.A0K = r0
            X.7CX r1 = r7.A00()
            X.USA r0 = new X.USA
            r0.<init>(r1, r6)
            r14.A0J = r0
            boolean r0 = r15 instanceof android.app.Activity
            if (r0 == 0) goto Ld9
            android.app.Activity r15 = (android.app.Activity) r15
        Lc7:
            X.W91 r0 = new X.W91
            r1 = r18
            r0.<init>(r15, r3, r1, r5)
            r14.A06 = r0
            r0 = r28
            r14.A0L = r0
            r0 = r19
            r14.A0I = r0
            return
        Ld9:
            r15 = 0
            goto Lc7
        Ldb:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66542ULx.<init>(android.content.Context, X.XGm, com.instagram.common.session.UserSession, X.VbP, X.V7T, X.Vhy, X.7CR, com.instagram.model.direct.DirectShareTarget, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static LocationSharingPresenterState A00(C66542ULx c66542ULx) {
        C69769Vv6 c69769Vv6 = ((AbstractC66543ULy) c66542ULx).A00;
        if (c69769Vv6 != null) {
            return (LocationSharingPresenterState) c69769Vv6.A01.A00(c69769Vv6.A02);
        }
        throw new IllegalStateException("Presenter is not attached.");
    }

    public static void A01(C66542ULx c66542ULx) {
        V7T v7t = c66542ULx.A0I;
        if (v7t != null) {
            IgdsButton igdsButton = v7t.A04;
            if (igdsButton != null) {
                igdsButton.setLoading(false);
            }
            IgdsButton igdsButton2 = v7t.A05;
            if (igdsButton2 != null) {
                igdsButton2.setLoading(false);
            }
            Context context = v7t.getContext();
            if (context != null) {
                AbstractC31176DnK.A12(context, C3DN.A00);
            }
        }
    }

    public static void A02(C66542ULx c66542ULx) {
        USA usa = c66542ULx.A0J;
        WUC[] wucArr = {c66542ULx.A0F};
        HashSet hashSet = new HashSet(((AbstractC69673VtI) usa).A00);
        hashSet.removeAll(Arrays.asList(wucArr));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            usa.A00((InterfaceC65338TiJ) it.next());
        }
    }

    @Override // X.AbstractC66543ULy
    public final void A06() {
        Handler handler = this.A00;
        handler.removeCallbacks(this.A08);
        handler.removeCallbacks(this.A07);
        this.A0K.A01(this.A0G);
        this.A0J.A01(this.A0F);
        W91 w91 = this.A06;
        InterfaceC41501vz interfaceC41501vz = w91.A00;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(w91.A02).A02(interfaceC41501vz, C55985OtI.class);
        }
        super.A06();
    }

    @Override // X.AbstractC66543ULy
    public final void A08() {
        if (this.A0L) {
            C69632VsZ c69632VsZ = this.A02;
            InterfaceC65636Tpx interfaceC65636Tpx = this.A0H;
            java.util.Set set = c69632VsZ.A05;
            set.remove(interfaceC65636Tpx);
            if (c69632VsZ.A01 && set.isEmpty()) {
                c69632VsZ.A01 = false;
            }
            Handler handler = this.A00;
            handler.removeCallbacks(this.A0A);
            handler.removeCallbacks(this.A09);
        }
        super.A08();
    }

    public final void A0A(long j) {
        if (j > 0) {
            long currentTimeMillis = System.currentTimeMillis() + j;
            if (A00(this).A03 == null) {
                Location location = A00(this).A04;
                if (location == null) {
                    W91 w91 = this.A06;
                    Activity activity = w91.A01;
                    if (activity != null && !AbstractC23451Ch.A08(activity, "android.permission.ACCESS_FINE_LOCATION")) {
                        W91.A00(this, w91);
                        return;
                    }
                    return;
                }
                AbstractC66543ULy.A04(this, null, "LOADING");
                C69270Vke c69270Vke = new C69270Vke(this.A01, location, this.A04, this.A0B, currentTimeMillis);
                WUB wub = new WUB(this, 3);
                C7CY c7cy = c69270Vke.A03;
                String str = c69270Vke.A04;
                long j2 = c69270Vke.A00;
                Location location2 = c69270Vke.A02;
                C63928Sw3 c63928Sw3 = new C63928Sw3(1, wub, c69270Vke);
                C14360o3.A0B(str, 0);
                UserSession userSession = c7cy.A00;
                float f = (float) location2.A00;
                float f2 = (float) location2.A01;
                long currentTimeMillis2 = System.currentTimeMillis();
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0B("direct_v2/threads/broadcast/create_live_location_session/");
                A0c.A0R(C60883RaU.class, C62810SSg.class);
                A0c.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                if (!C18U.A06(C06090Tz.A05, userSession, 36321086723728532L)) {
                    A0c.A0C(com.facebook.location.platform.api.Location.LATITUDE, f);
                    A0c.A0C("longitude", f2);
                    A0c.A0E(AbstractC58317Pt9.A00(791), TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2));
                }
                A0c.A0E("expiration_timestamp_s", TimeUnit.MILLISECONDS.toSeconds(j2));
                C1ON A0N = A0c.A0N();
                A0N.A00 = new RaY(c63928Sw3, userSession, c7cy, str, j2);
                C1GJ.A03(A0N);
            }
        }
    }

    public static void A03(C66542ULx c66542ULx, LiveLocationSession liveLocationSession, boolean z) {
        AbstractC66543ULy.A05(c66542ULx, "Calling stopLiveLocation(). session=%s userInitiatedStop=%b", liveLocationSession, Boolean.valueOf(z));
        AbstractC66543ULy.A04(c66542ULx, null, "LOADING");
        new C62943SYl(c66542ULx.A01, liveLocationSession, c66542ULx.A04).A00(new WU9(c66542ULx, liveLocationSession, z));
    }

    @Override // X.AbstractC66543ULy
    public final void A07() {
        EnumC68117VCa enumC68117VCa;
        Activity activity;
        super.A07();
        if (this.A0L) {
            C69108Vhy c69108Vhy = this.A03;
            C23031Ai c23031Ai = c69108Vhy.A01;
            if (AbstractC167017dG.A1b(c23031Ai, c23031Ai.A3n, C23031Ai.A8c, 206)) {
                enumC68117VCa = EnumC68117VCa.ACCEPTED;
            } else if (c69108Vhy.A00) {
                enumC68117VCa = EnumC68117VCa.SEEN;
            } else {
                enumC68117VCa = EnumC68117VCa.NOT_SEEN;
            }
            int ordinal = enumC68117VCa.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2 && (activity = this.A06.A01) != null) {
                    AbstractC23451Ch.A08(activity, "android.permission.ACCESS_FINE_LOCATION");
                }
            } else {
                W91.A00(this, this.A06);
            }
            c69108Vhy.A00 = true;
            C69632VsZ c69632VsZ = this.A02;
            c69632VsZ.A05.add(this.A0H);
            if (!c69632VsZ.A01) {
                c69632VsZ.A01 = true;
            }
            Handler handler = this.A00;
            Runnable runnable = this.A0A;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            Runnable runnable2 = this.A09;
            handler.removeCallbacks(runnable2);
            handler.postDelayed(runnable2, 10000L);
        }
    }
}
