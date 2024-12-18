package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapCaptureViewModel$special$$inlined$filter$1$2;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;

/* renamed from: X.8HC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HC extends AbstractC52922bZ {
    public int A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final InterfaceC60152ox A06;
    public final C3I9 A07;
    public final C1810981l A08;
    public final C23031Ai A09;
    public final C191138dB A0A;
    public final C191068d2 A0B;
    public final QuickSnapRepository A0C;
    public final InterfaceC19390xP A0D;
    public final InterfaceC06180Ui A0E;
    public final C05A A0F;
    public final C0UO A0G;
    public final TargetViewSizeProvider A0H;

    public C8HC(UserSession userSession, C3I9 c3i9, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, C191138dB c191138dB, C191068d2 c191068d2, QuickSnapRepository quickSnapRepository) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c1810981l, 2);
        C14360o3.A0B(targetViewSizeProvider, 3);
        C14360o3.A0B(c191068d2, 4);
        C14360o3.A0B(c3i9, 5);
        C14360o3.A0B(quickSnapRepository, 6);
        this.A05 = userSession;
        this.A08 = c1810981l;
        this.A0H = targetViewSizeProvider;
        this.A0B = c191068d2;
        this.A07 = c3i9;
        this.A0C = quickSnapRepository;
        this.A0A = c191138dB;
        this.A09 = AbstractC23021Ah.A00(userSession);
        this.A01 = A02(this);
        this.A03 = true;
        C008002u A00 = C10E.A00(null);
        this.A0F = A00;
        this.A0G = A00;
        final AnonymousClass057 A002 = C10M.A00(C05F.A00, 0, 0);
        this.A0E = A002;
        this.A0D = new InterfaceC19390xP(this) { // from class: X.8dD
            public final /* synthetic */ C8HC A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = A002.collect(new QuickSnapCaptureViewModel$special$$inlined$filter$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        this.A06 = new InterfaceC60152ox() { // from class: X.8dE
            @Override // X.InterfaceC60152ox
            public final void DOK(int i, boolean z) {
                C8HC c8hc = C8HC.this;
                boolean z2 = false;
                if (i > 0) {
                    z2 = true;
                }
                c8hc.A02 = z2;
                c8hc.A00 = i;
                c8hc.A04 = true;
                C8HC.A04(c8hc, new C57748Pjb(c8hc, 46));
                C8HC.A05(c8hc, true, false, false);
            }
        };
    }

    public static final C51719Msw A00(C8HC c8hc) {
        int intValue = c8hc.A01.intValue();
        if (intValue != 0 && intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue == 4) {
                        return new C51719Msw(true, true, true);
                    }
                    throw new RuntimeException();
                }
                return new C51719Msw(false, true, true);
            }
            return new C51719Msw(false, false, false);
        }
        return new C51719Msw(false, true, false);
    }

    public static final C51720Msx A01(C8HC c8hc) {
        int intValue = c8hc.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            throw new RuntimeException();
                        }
                    } else {
                        return new C51720Msx(false, false, true);
                    }
                }
                return C51720Msx.A03;
            }
            return new C51720Msx(false, true, false);
        }
        return new C51720Msx(true, false, false);
    }

    public static final Integer A02(C8HC c8hc) {
        if (!C18U.A06(C06090Tz.A05, c8hc.A05, 36325484769916005L)) {
            C23031Ai c23031Ai = c8hc.A09;
            InterfaceC16530ry interfaceC16530ry = c23031Ai.A6p;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (((Boolean) interfaceC16530ry.CES(c23031Ai, c0yrArr[517])).booleanValue()) {
                return C05F.A0Y;
            }
            if (((Boolean) c23031Ai.A6q.CES(c23031Ai, c0yrArr[518])).booleanValue()) {
                return C05F.A0N;
            }
        }
        return C05F.A00;
    }

    public static final void A04(C8HC c8hc, InterfaceC16660sJ interfaceC16660sJ) {
        C05A c05a = c8hc.A0F;
        Object value = c05a.getValue();
        if (value == null) {
            value = new C51724Mt1(new C51719Msw(false, true, false), C51720Msx.A03, "", false, false, false, false, true);
        }
        do {
        } while (!c05a.AIi(c05a.getValue(), interfaceC16660sJ.invoke(value)));
        c8hc.A04 = false;
    }

    public static final void A05(C8HC c8hc, boolean z, boolean z2, boolean z3) {
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) c8hc.A0H;
        int i = nineSixteenLayoutConfigImpl.A06;
        int i2 = nineSixteenLayoutConfigImpl.A04;
        int A00 = c8hc.A0B.A00();
        float f = (i - A00) / 2.0f;
        float A002 = (((i2 - A00) - (c8hc.A00 / 2.0f)) / 2.0f) - AMo.A00(r4.A00, R.dimen.account_group_management_title_text_horizontal_padding);
        int i3 = A00;
        float f2 = A002;
        if (!z) {
            i3 = i;
            A00 = i2;
            f = 0.0f;
            f2 = 0.0f;
        }
        A03(new C56506P7e(new C26044BfX(f, f2, A002, i3, A00, z, z2), z3), c8hc);
    }

    public final void A06() {
        A04(this, C57665PiG.A00);
        A03(new C24005Akj(false), this);
        A03(C24004Aki.A00, this);
        A05(this, false, true, false);
        this.A07.EFx(this.A06);
        this.A03 = true;
    }

    public final void A07() {
        Integer num;
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        num = C05F.A0Y;
                    } else {
                        C23031Ai c23031Ai = this.A09;
                        c23031Ai.A6p.Egi(c23031Ai, true, C23031Ai.A8c[517]);
                        A03(new C24005Akj(true), this);
                        num = C05F.A0Y;
                    }
                } else {
                    num = C05F.A0N;
                }
            } else {
                C23031Ai c23031Ai2 = this.A09;
                c23031Ai2.A6q.Egi(c23031Ai2, true, C23031Ai.A8c[518]);
                num = C05F.A0C;
            }
        } else {
            num = C05F.A01;
        }
        this.A01 = num;
        A04(this, new C57748Pjb(this, 47));
        A05(this, true, false, true);
    }

    public static final void A03(BBD bbd, C8HC c8hc) {
        C141796aw A00 = AbstractC141776au.A00(c8hc);
        C9D4 c9d4 = new C9D4(bbd, c8hc, (InterfaceC23621Ds) null, 22);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, A00);
    }
}
