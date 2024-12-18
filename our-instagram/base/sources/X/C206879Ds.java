package X;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableSet;
import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.9Ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206879Ds extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206879Ds(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v58, types: [X.CUa, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        int i;
        long j;
        switch (this.A00) {
            case 0:
                return C17060sy.A01.A01(((C3iR) this.A01).A00);
            case 1:
                C3W9 c3w9 = (C3W9) this.A01;
                TextView textView = (TextView) c3w9.A00().requireViewById(R.id.violation_banner_text);
                textView.setHighlightColor(c3w9.A00().getContext().getColor(R.color.fds_transparent));
                return textView;
            case 2:
                return ((C3W9) this.A01).A00.inflate();
            case 3:
                return new C97N((UserSession) this.A01);
            case 4:
                UserSession userSession = (UserSession) this.A01;
                return new C70614Wds(new C97O(userSession, C05F.A0N), userSession);
            case 5:
                UserSession userSession2 = (UserSession) this.A01;
                return new C70615Wdt(new C97O(userSession2, C05F.A0C), userSession2);
            case 6:
                UserSession userSession3 = (UserSession) this.A01;
                return new C66009Ty4(new C97O(userSession3, C05F.A00), userSession3);
            case 7:
                UserSession userSession4 = (UserSession) this.A01;
                return new C97P(new C97O(userSession4, C05F.A01), userSession4);
            case 8:
                UserSession userSession5 = ((C97O) this.A01).A00;
                return userSession5.A01(AKJ.class, new X2y(userSession5, 48));
            case 9:
                return new C3NY[((InterfaceC19390xP[]) this.A01).length];
            case 10:
                return new C198438ps((UserSession) this.A01);
            case 11:
                UserSession userSession6 = (UserSession) this.A01;
                return new C49632Pw(new C24Q(userSession6), userSession6);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C1AT.A01(((C52F) this.A01).A02).A03(C1AV.A1z);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Context context = ((C52D) this.A01).A01;
                if (context != null) {
                    C15900qk.A01();
                    j = C15900qk.A00(context, true) / 1048576;
                } else {
                    j = -1;
                }
                return Long.valueOf(j);
            case 14:
                Context context2 = ((C52D) this.A01).A01;
                if (context2 != null) {
                    i = C04100Kb.A00(context2);
                } else {
                    i = 2014;
                }
                return Integer.valueOf(i);
            case Process.SIGTERM /* 15 */:
                return ((C4SZ) this.A01).A08.invoke();
            case 16:
                AbstractC153666vb abstractC153666vb = (AbstractC153666vb) this.A01;
                return Boolean.valueOf(((C5R4) abstractC153666vb.A03).ARZ(abstractC153666vb.A05));
            case 17:
                ArrayList arrayList = new ArrayList();
                arrayList.add(ClipsTemplatesStickerType.A07);
                arrayList.add(ClipsTemplatesStickerType.A05);
                return arrayList;
            case 18:
                return new C187008Qt((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                return new C167977es((UserSession) this.A01);
            case 20:
                C1XD c1xd = (C1XD) this.A01;
                C27956CUa c27956CUa = c1xd.A00;
                if (c27956CUa != null) {
                    return c27956CUa;
                }
                ?? obj = new Object();
                c1xd.A00 = obj;
                return obj;
            case 21:
                ((C24531Hw) this.A01).A0B = true;
                return C0eB.A00;
            case 22:
            case 23:
                return new C167387ds((UserSession) this.A01);
            case 24:
            case 25:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case 26:
                C169577hX c169577hX = (C169577hX) this.A01;
                return C1OU.A01(c169577hX.A01, c169577hX.A02);
            case 27:
                return Boolean.valueOf(((C169597hZ) this.A01).A0F);
            case 28:
                C76223bS c76223bS = (C76223bS) this.A01;
                SpannableString spannableString = new SpannableString(AbstractC77623dm.A0F(c76223bS, 2131954794));
                spannableString.setSpan(new ForegroundColorSpan(AbstractC77623dm.A03(c76223bS, AbstractC53242c7.A09(c76223bS.A05.A0C))), 0, spannableString.length(), 33);
                return spannableString;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                ((C167217da) this.A01).A02.A0G();
                return C0eB.A00;
            case 30:
                C167217da c167217da = (C167217da) this.A01;
                UserSession userSession7 = c167217da.A04;
                return new C167257de(AbstractC12220kQ.A02(userSession7), userSession7, c167217da.A01.A04);
            case 31:
                A87 a87 = (A87) this.A01;
                if (a87 != null) {
                    if (!a87.A00) {
                        a87.A01.start();
                    }
                    a87.A00 = true;
                }
                return new C79353gg(new D89(a87, 45));
            case 32:
                C167847ee c167847ee = new C167847ee();
                C76223bS c76223bS2 = (C76223bS) this.A01;
                c167847ee.A05(AbstractC77623dm.A02(c76223bS2, R.attr.igds_color_stroke));
                int A03 = AbstractC77623dm.A03(c76223bS2, R.color.cds_white_a20);
                C84793qT c84793qT = c167847ee.A00;
                c84793qT.A09 = A03;
                c84793qT.A06 = 0;
                c167847ee.A04(1500L);
                c84793qT.A03 = 0.0f;
                return c167847ee.A01();
            case 33:
            case 34:
            default:
                C25814BbV c25814BbV = ((C166737cl) this.A01).A00;
                c25814BbV.A09.A01();
                c25814BbV.A0O.Egh(C167487e3.A00);
                return C0eB.A00;
            case 35:
                int A01 = (int) C18U.A01(C06090Tz.A05, ((C166737cl) this.A01).A01, 36600216648683324L);
                InterfaceC89793zL interfaceC89793zL = AbstractC51432Xq.A01;
                return new C89803zM(A01);
            case 36:
                Context context3 = ((C76223bS) this.A01).A05.A0C;
                C14360o3.A07(context3);
                return Integer.valueOf((int) AbstractC13880nE.A04(context3, 36));
            case 37:
                return new LinearLayout.LayoutParams(((C167757eV) this.A01).A00, -2, 1.0f);
            case 38:
                UserSession userSession8 = ((C5E6) this.A01).A02;
                if (userSession8 != null) {
                    return new C28173CbK(userSession8);
                }
                throw new IllegalStateException("Required value was null.");
            case 39:
                C5E6 c5e6 = (C5E6) this.A01;
                c5e6.A02 = (UserSession) C5Zy.A00(AbstractC117935Vd.A00, c5e6);
                c5e6.A03 = (InterfaceC60442pS) C5Zy.A00(AbstractC117915Vb.A00, c5e6);
                return C0eB.A00;
            case 40:
                C5E6 c5e62 = (C5E6) this.A01;
                UserSession userSession9 = c5e62.A02;
                if (userSession9 != null) {
                    return AbstractC12220kQ.A01(c5e62.A03, userSession9);
                }
                throw new IllegalStateException("Required value was null.");
            case Seq.NULL_REFNUM /* 41 */:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C1OC) this.A01).A00, 36316954964857576L));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C1OC) this.A01).A00, 36316954964792039L));
            case 43:
                return Integer.valueOf((int) C18U.A01(C06090Tz.A05, (AbstractC12990ll) this.A01, 36591944541077573L));
            case 44:
                return Integer.valueOf((int) C18U.A01(C06090Tz.A05, (AbstractC12990ll) this.A01, 36591944541012036L));
            case 45:
                return Integer.valueOf((int) C18U.A00(C06090Tz.A05, (AbstractC12990ll) this.A01, 37154894494367749L));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                final InterfaceC14020nS interfaceC14020nS = ((C12M) this.A01).A00;
                final boolean z2 = false;
                return new C12T(interfaceC14020nS, z2) { // from class: X.18z
                    public final InterfaceC14020nS A00;
                    public final boolean A01;

                    @Override // X.C12T
                    public final void A05(final Runnable runnable, C12W c12w) {
                        final int i2;
                        final int i3;
                        C14360o3.A0B(c12w, 0);
                        C14360o3.A0B(runnable, 1);
                        InterfaceC14020nS interfaceC14020nS2 = this.A00;
                        C13990nP c13990nP = (C13990nP) c12w.get(C13990nP.A01);
                        if (c13990nP != null) {
                            i2 = c13990nP.A00;
                        } else {
                            i2 = -18;
                        }
                        C14010nR c14010nR = (C14010nR) c12w.get(C14010nR.A01);
                        if (c14010nR != null) {
                            i3 = c14010nR.A00;
                        } else {
                            i3 = 3;
                        }
                        final boolean z3 = this.A01;
                        interfaceC14020nS2.ATO(new AbstractRunnableC14200nk(i2, i3, z3) { // from class: X.1ED
                            @Override // java.lang.Runnable
                            public final void run() {
                                runnable.run();
                            }
                        });
                    }

                    {
                        this.A00 = interfaceC14020nS;
                        this.A01 = z2;
                    }
                };
            case 47:
                final InterfaceC14020nS interfaceC14020nS2 = ((C12M) this.A01).A00;
                final boolean z3 = true;
                return new C12T(interfaceC14020nS2, z3) { // from class: X.18z
                    public final InterfaceC14020nS A00;
                    public final boolean A01;

                    @Override // X.C12T
                    public final void A05(final Runnable runnable, C12W c12w) {
                        final int i2;
                        final int i3;
                        C14360o3.A0B(c12w, 0);
                        C14360o3.A0B(runnable, 1);
                        InterfaceC14020nS interfaceC14020nS22 = this.A00;
                        C13990nP c13990nP = (C13990nP) c12w.get(C13990nP.A01);
                        if (c13990nP != null) {
                            i2 = c13990nP.A00;
                        } else {
                            i2 = -18;
                        }
                        C14010nR c14010nR = (C14010nR) c12w.get(C14010nR.A01);
                        if (c14010nR != null) {
                            i3 = c14010nR.A00;
                        } else {
                            i3 = 3;
                        }
                        final boolean z32 = this.A01;
                        interfaceC14020nS22.ATO(new AbstractRunnableC14200nk(i2, i3, z32) { // from class: X.1ED
                            @Override // java.lang.Runnable
                            public final void run() {
                                runnable.run();
                            }
                        });
                    }

                    {
                        this.A00 = interfaceC14020nS2;
                        this.A01 = z3;
                    }
                };
            case 48:
                java.util.Set<String> categories = ((Intent) this.A01).getCategories();
                if (categories != null) {
                    return ImmutableSet.A03(categories);
                }
                return null;
            case 49:
                Boolean bool = null;
                try {
                    Bundle extras = ((Intent) this.A01).getExtras();
                    if (extras != null) {
                        bool = Boolean.valueOf(extras.getBoolean(AbstractC111324zv.A00(3652)));
                    }
                } catch (BadParcelableException unused) {
                }
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
