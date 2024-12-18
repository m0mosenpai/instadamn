package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.8Mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186058Mz implements C87B {
    public int A00;
    public EnumC189218Zt A01;
    public C87J A02;
    public boolean A03 = true;
    public boolean A04;
    public final Fragment A05;
    public final C185948Mo A06;
    public final C87H A07;
    public final ViewGroup A08;
    public final UserSession A09;
    public final ClipsCreationViewModel A0A;
    public final C89P A0B;
    public final LoadingSpinnerView A0C;

    @Override // X.C87B
    public final void DOt() {
    }

    @Override // X.C87B
    public final void Dp5() {
        this.A04 = false;
    }

    @Override // X.C87B
    public final void DzD() {
    }

    @Override // X.C87B
    public final void Dzq(int i) {
    }

    public C186058Mz(ViewGroup viewGroup, Fragment fragment, UserSession userSession, C185948Mo c185948Mo) {
        this.A09 = userSession;
        this.A05 = fragment;
        FragmentActivity requireActivity = fragment.requireActivity();
        this.A07 = ((C87G) new C52942bb(requireActivity).A00(C87G.class)).A00("post_capture");
        this.A06 = c185948Mo;
        this.A0A = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, requireActivity), requireActivity).A00(ClipsCreationViewModel.class);
        this.A0B = (C89P) new C52942bb(AbstractC183548Cd.A00(requireActivity, userSession), requireActivity).A00(C89P.class);
        this.A0C = (LoadingSpinnerView) viewGroup.requireViewById(R.id.loading_track_spinner);
        this.A08 = (ViewGroup) viewGroup.requireViewById(R.id.loading_track_spinner_container);
        C87H c87h = this.A07;
        C2GS c2gs = c87h.A0F;
        Fragment fragment2 = this.A05;
        c2gs.A06(fragment2, new C151846sU(new InterfaceC58362lv() { // from class: X.8N0
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C9KW c9kw;
                InterfaceC58201Pr7 interfaceC58201Pr7;
                C09530e4 c09530e4 = (C09530e4) obj;
                C185948Mo c185948Mo2 = C186058Mz.this.A06;
                String str = (String) c09530e4.A00;
                C1125456i c1125456i = (C1125456i) c09530e4.A01;
                C9KJ c9kj = c185948Mo2.A0B;
                if (c9kj != null && (c9kw = c9kj.A08) != null && (c9kw instanceof C219919nd)) {
                    AbstractC167017dG.A1N(str, c1125456i);
                    C55208OeM c55208OeM = ((C219919nd) c9kw).A05;
                    if (c55208OeM != null && (interfaceC58201Pr7 = c55208OeM.A04) != null) {
                        interfaceC58201Pr7.FCk(c1125456i, str);
                    }
                }
            }
        }));
        c87h.A0B.A06(fragment2, new C151846sU(new InterfaceC58362lv() { // from class: X.8N1
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C186058Mz c186058Mz = C186058Mz.this;
                Integer num = (Integer) obj;
                if (c186058Mz.A00 != 0) {
                    c186058Mz.A06.A0L(num.intValue());
                    c186058Mz.A07.A0A(new AiA(c186058Mz, num));
                }
            }
        }));
        c87h.A09.A06(fragment2, new C151846sU(new InterfaceC58362lv() { // from class: X.8N2
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C186058Mz c186058Mz = C186058Mz.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c186058Mz.A03 = booleanValue;
                if (booleanValue) {
                    C186058Mz.A01(c186058Mz);
                } else {
                    c186058Mz.A06.A0K();
                }
            }
        }));
        c87h.A0A.A06(fragment2, new InterfaceC58362lv() { // from class: X.8N3
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C186058Mz.this.A01 = (EnumC189218Zt) obj;
            }
        });
        c87h.A08.A06(fragment2, new InterfaceC58362lv() { // from class: X.8N4
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C9KW c9kw;
                C185948Mo c185948Mo2 = C186058Mz.this.A06;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C9KJ c9kj = c185948Mo2.A0B;
                if (c9kj != null && (c9kw = c9kj.A08) != null) {
                    c9kw.A0L(booleanValue);
                }
            }
        });
        c87h.A05.A06(fragment2, new InterfaceC58362lv() { // from class: X.8N5
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                float floatValue;
                C186058Mz c186058Mz = C186058Mz.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C185948Mo c185948Mo2 = c186058Mz.A06;
                if (booleanValue) {
                    floatValue = 0.0f;
                } else {
                    Object A02 = c186058Mz.A07.A0H.A02();
                    A02.getClass();
                    floatValue = ((Number) A02).floatValue();
                }
                c185948Mo2.A00 = floatValue;
                C9KJ c9kj = c185948Mo2.A0B;
                if (c9kj != null) {
                    if (c185948Mo2.A0L) {
                        floatValue = 0.0f;
                    }
                    C9KW c9kw = c9kj.A08;
                    if (c9kw != null) {
                        c9kw.A0G(floatValue);
                    }
                }
            }
        });
        c87h.A0G.A06(fragment2, new InterfaceC58362lv() { // from class: X.8N6
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C186058Mz.this.A02 = (C87J) obj;
            }
        });
        C2GS c2gs2 = c87h.A0D;
        final C185948Mo c185948Mo2 = this.A06;
        c185948Mo2.getClass();
        c2gs2.A06(fragment2, new InterfaceC58362lv() { // from class: X.8N7
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C185948Mo.this.A0N = ((Boolean) obj).booleanValue();
            }
        });
        C75M.A00(c87h.A02).A06(fragment2, new InterfaceC58362lv() { // from class: X.8N8
            /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
            
                if (r6 == null) goto L18;
             */
            @Override // X.InterfaceC58362lv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r8) {
                /*
                    r7 = this;
                    X.8Mz r3 = X.C186058Mz.this
                    X.8he r8 = (X.AbstractC193598he) r8
                    int r1 = r8.A00
                    if (r1 == 0) goto L78
                    r4 = 0
                    r0 = 3
                    if (r1 != r0) goto L7f
                    X.8Zt r1 = r3.A01
                    X.8Zt r0 = X.EnumC189218Zt.A05
                    if (r1 == r0) goto L16
                    boolean r0 = r3.A03
                    if (r0 == 0) goto L17
                L16:
                    r4 = 1
                L17:
                    X.87H r2 = r3.A07
                    X.2GS r0 = r2.A0E
                    java.lang.Object r1 = r0.A02()
                    X.8A8 r1 = (X.C8A8) r1
                    if (r1 == 0) goto L2c
                    boolean r0 = r1.A00
                    if (r0 == 0) goto L79
                    r6 = 0
                L28:
                    java.lang.Number r6 = (java.lang.Number) r6
                    if (r6 != 0) goto L3b
                L2c:
                    X.2GS r0 = r2.A07
                    java.lang.Object r0 = r0.A02()
                    r0.getClass()
                    X.0e4 r0 = (X.C09530e4) r0
                    java.lang.Object r6 = r0.A00
                    java.lang.Number r6 = (java.lang.Number) r6
                L3b:
                    X.8Mo r5 = r3.A06
                    X.22P r1 = r5.A0Y
                    r0 = 0
                    X.C14360o3.A0B(r1, r0)
                    X.22P r0 = X.C22P.A1r
                    if (r1 == r0) goto L5f
                    X.22P r0 = X.C22P.A1s
                    if (r1 == r0) goto L5f
                    X.22P r0 = X.C22P.A1Y
                    if (r1 == r0) goto L5f
                    X.22P r0 = X.C22P.A1Z
                    if (r1 == r0) goto L5f
                    X.22P r0 = X.C22P.A1O
                    if (r1 == r0) goto L5f
                    X.22P r0 = X.C22P.A2p
                    if (r1 == r0) goto L5f
                    X.22P r0 = X.C22P.A1J
                    if (r1 != r0) goto L68
                L5f:
                    X.02i r2 = X.C006802i.A0p
                    r1 = 366619078(0x15da29c6, float:8.8115406E-26)
                    r0 = 2
                    r2.markerEnd(r1, r0)
                L68:
                    java.lang.Object r1 = r8.A00()
                    X.8lW r1 = (X.C195868lW) r1
                    int r0 = r6.intValue()
                    r5.A0R(r1, r0, r4)
                L75:
                    X.C186058Mz.A01(r3)
                L78:
                    return
                L79:
                    r0 = 1
                    r1.A00 = r0
                    java.lang.Object r6 = r1.A01
                    goto L28
                L7f:
                    r0 = 4
                    if (r1 != r0) goto L75
                    androidx.fragment.app.Fragment r0 = r3.A05
                    android.content.Context r1 = r0.getContext()
                    java.lang.String r0 = "stitched_video_status_error"
                    X.C9GR.A0B(r1, r0)
                    goto L75
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8N8.onChanged(java.lang.Object):void");
            }
        });
        c87h.A07.A06(fragment2, new InterfaceC58362lv() { // from class: X.8N9
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C09530e4 c09530e4 = (C09530e4) obj;
                C186058Mz.this.A06.A0M(((Number) c09530e4.A00).intValue(), ((Number) c09530e4.A01).intValue());
            }
        });
        c87h.A0H.A06(fragment2, new InterfaceC58362lv() { // from class: X.8NA
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C186058Mz c186058Mz = C186058Mz.this;
                C185948Mo c185948Mo3 = c186058Mz.A06;
                Object A02 = c186058Mz.A07.A0H.A02();
                A02.getClass();
                float floatValue = ((Number) A02).floatValue();
                c185948Mo3.A00 = floatValue;
                C9KJ c9kj = c185948Mo3.A0B;
                if (c9kj != null) {
                    if (c185948Mo3.A0L) {
                        floatValue = 0.0f;
                    }
                    C9KW c9kw = c9kj.A08;
                    if (c9kw != null) {
                        c9kw.A0G(floatValue);
                    }
                }
            }
        });
        c87h.A0I.A06(fragment2, new InterfaceC58362lv() { // from class: X.8NB
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C9KW c9kw;
                C55208OeM c55208OeM;
                C186058Mz c186058Mz = C186058Mz.this;
                float floatValue = ((Number) obj).floatValue();
                C9KJ c9kj = c186058Mz.A06.A0B;
                if (c9kj != null && (c9kw = c9kj.A08) != null && (c9kw instanceof C219919nd) && (c55208OeM = ((C219919nd) c9kw).A05) != null) {
                    if (floatValue < 0.0f) {
                        floatValue = 0.0f;
                    } else if (floatValue > 1.0f) {
                        floatValue = 1.0f;
                    }
                    if (Float.compare(floatValue, c55208OeM.A00) != 0) {
                        c55208OeM.A00 = floatValue;
                        C55208OeM.A04(c55208OeM, null);
                    }
                }
            }
        });
    }

    private void A00() {
        if (this.A04) {
            if (A02() && this.A03) {
                this.A0C.setLoadingStatus(MY0.A02);
                this.A08.setVisibility(0);
                C87H c87h = this.A07;
                c87h.A0A.A0B(EnumC189218Zt.A03);
                return;
            }
            this.A0C.setLoadingStatus(MY0.A03);
            this.A08.setVisibility(8);
        }
    }

    public static void A01(C186058Mz c186058Mz) {
        int i;
        int i2;
        C9KW c9kw;
        if (c186058Mz.A03 && !c186058Mz.A02()) {
            C185948Mo c185948Mo = c186058Mz.A06;
            C9KJ c9kj = c185948Mo.A0B;
            if (c9kj != null) {
                int i3 = c9kj.A02;
                C9KW c9kw2 = c9kj.A08;
                if (c9kw2 != null) {
                    i = c9kw2.A07();
                } else {
                    i = -1;
                }
                if (i3 != -1) {
                    C9KJ c9kj2 = c185948Mo.A0B;
                    if (i >= c9kj2.A02) {
                        i2 = c9kj2.A03;
                        c185948Mo.A0L(i2);
                    }
                    if (!c185948Mo.A0B.CoQ() && (c9kw = c185948Mo.A0B.A08) != null) {
                        c9kw.A0D();
                    }
                } else {
                    if (i >= c185948Mo.A0E()) {
                        i2 = 0;
                        c185948Mo.A0L(i2);
                    }
                    if (!c185948Mo.A0B.CoQ()) {
                        c9kw.A0D();
                    }
                }
            }
        } else if (c186058Mz.A02()) {
            c186058Mz.A06.A0K();
        }
        c186058Mz.A00();
    }

    private boolean A02() {
        C2GT c2gt = this.A0A.A0K.A06;
        if (c2gt.A02() == null || !((AbstractC193598he) c2gt.A02()).A01()) {
            Object A02 = this.A07.A02.A02();
            A02.getClass();
            if (!((AbstractC193598he) A02).A01()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C87B
    public final void DOs() {
        C87H c87h = this.A07;
        EnumC189218Zt enumC189218Zt = EnumC189218Zt.A04;
        if (enumC189218Zt != c87h.A0A.A02()) {
            C11T.A02(new RunnableC189738as(enumC189218Zt, c87h));
        }
    }

    @Override // X.C87B
    public final void Dl9(int i) {
        this.A00 = i;
        this.A04 = true;
    }

    @Override // X.C87B
    public final void Dzd() {
        this.A07.A0J.Egh(true);
    }

    @Override // X.C87B
    public final void Dzf() {
        this.A07.A0J.Egh(false);
    }

    @Override // X.C87B
    public final void E03() {
        C87H c87h = this.A07;
        EnumC189218Zt enumC189218Zt = EnumC189218Zt.A05;
        if (enumC189218Zt != c87h.A0A.A02()) {
            C11T.A02(new RunnableC189738as(enumC189218Zt, c87h));
        }
        A00();
    }

    @Override // X.C87B
    public final void E0B() {
        C87H c87h = this.A07;
        EnumC189218Zt enumC189218Zt = EnumC189218Zt.A04;
        if (enumC189218Zt != c87h.A0A.A02()) {
            C11T.A02(new RunnableC189738as(enumC189218Zt, c87h));
        }
    }

    @Override // X.C87B
    public final boolean AG5(InterfaceC185968Mq interfaceC185968Mq) {
        return !A02();
    }
}
