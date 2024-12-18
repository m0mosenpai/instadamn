package X;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9FZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FZ extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FZ(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(3);
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier Eq3;
        switch (this.A00) {
            case 0:
                C6N2 c6n2 = (C6N2) obj;
                C5Tl c5Tl = (C5Tl) obj2;
                ((Number) obj3).intValue();
                if (C0fH.A02()) {
                    C0fH.A01(409468393, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
                }
                Object obj4 = this.A01;
                Object EEc = c5Tl.EEc();
                Object obj5 = C5UI.A00;
                if (EEc == obj5) {
                    EEc = new C6N7(c6n2, new DGT(obj4, 17));
                    c5Tl.FBy(EEc);
                }
                final C6N7 c6n7 = (C6N7) EEc;
                Object EEc2 = c5Tl.EEc();
                if (EEc2 == obj5) {
                    EEc2 = new C6NA(new SubcomposeSlotReusePolicy(c6n7) { // from class: X.6N8
                        public final C6N7 A00;
                        public final Map A01 = new LinkedHashMap();

                        @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
                        public final boolean ACN(Object obj6, Object obj7) {
                            C6N7 c6n72 = this.A00;
                            return C14360o3.A0K(c6n72.A00(obj6), c6n72.A00(obj7));
                        }

                        @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
                        public final void Bxp(C6NQ c6nq) {
                            int i;
                            Map map = this.A01;
                            map.clear();
                            Iterator it = c6nq.iterator();
                            while (it.hasNext()) {
                                Object A00 = this.A00.A00(it.next());
                                Number number = (Number) map.get(A00);
                                if (number != null) {
                                    i = number.intValue();
                                    if (i == 7) {
                                        it.remove();
                                    }
                                } else {
                                    i = 0;
                                }
                                map.put(A00, Integer.valueOf(i + 1));
                            }
                        }

                        {
                            this.A00 = c6n7;
                        }
                    });
                    c5Tl.FBy(EEc2);
                }
                C6NA c6na = (C6NA) EEc2;
                C6MH c6mh = (C6MH) this.A04;
                if (c6mh != null) {
                    c5Tl.Eno(205264983);
                    c5Tl.Eno(6622915);
                    if (C0fH.A02()) {
                        C0fH.A01(-1935379076, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)");
                    }
                    Object obj6 = C6NB.A00;
                    if (obj6 != null) {
                        c5Tl.Eno(1213893039);
                    } else {
                        c5Tl.Eno(1213931944);
                        View view = (View) c5Tl.AJX(AndroidCompositionLocals_androidKt.A03);
                        boolean AH4 = c5Tl.AH4(view);
                        Object EEc3 = c5Tl.EEc();
                        if (AH4 || EEc3 == obj5) {
                            EEc3 = new C6NE(view);
                            c5Tl.FBy(EEc3);
                        }
                        obj6 = (C6NE) EEc3;
                    }
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk, false);
                    if (C0fH.A02()) {
                        C0fH.A00(750518060);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    Object[] objArr = {c6mh, c6n7, c6na, obj6};
                    boolean AH42 = c5Tl.AH4(c6mh) | c5Tl.AH6(c6n7) | c5Tl.AH6(c6na) | c5Tl.AH6(obj6);
                    Object EEc4 = c5Tl.EEc();
                    if (AH42 || EEc4 == obj5) {
                        EEc4 = new C50372MLz(3, c6n7, c6na, c6mh, obj6);
                        c5Tl.FBy(EEc4);
                    }
                    C5UX.A06(c5Tl, (InterfaceC16660sJ) EEc4, objArr);
                } else {
                    c5Tl.Eno(205858881);
                }
                C117505Tk.A0L((C117505Tk) c5Tl, false);
                Modifier modifier = (Modifier) this.A03;
                if (c6mh != null && (Eq3 = modifier.Eq3(new TraversablePrefetchStateModifierElement(c6mh))) != null) {
                    modifier = Eq3;
                }
                boolean AH43 = c5Tl.AH4(c6n7);
                Object obj7 = this.A02;
                boolean AH44 = AH43 | c5Tl.AH4(obj7);
                Object EEc5 = c5Tl.EEc();
                if (AH44 || EEc5 == obj5) {
                    EEc5 = new C30484DbT(4, c6n7, obj7);
                    c5Tl.FBy(EEc5);
                }
                C6NH.A00(c5Tl, modifier, c6na, (InterfaceC16620sF) EEc5, 8, 0);
                if (C0fH.A02()) {
                    C0fH.A00(1009371908);
                    break;
                }
                break;
            case 1:
                Context context = (Context) obj;
                EnumC74373Vt enumC74373Vt = (EnumC74373Vt) obj2;
                EnumC79303gb enumC79303gb = (EnumC79303gb) obj3;
                C14360o3.A0B(context, 0);
                C14360o3.A0B(enumC74373Vt, 1);
                C14360o3.A0B(enumC79303gb, 2);
                return ((C96464Vf) this.A04).A02.A01(context, (C38321qM) this.A01, (InterfaceC60442pS) this.A03, (C75113Zb) this.A02, enumC79303gb, enumC74373Vt);
            case 2:
                ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = (ViewOnAttachStateChangeListenerC110564yT) obj;
                C75113Zb c75113Zb = (C75113Zb) obj2;
                C19260xA c19260xA = (C19260xA) obj3;
                C14360o3.A0B(viewOnAttachStateChangeListenerC110564yT, 0);
                C14360o3.A0B(c75113Zb, 1);
                Object obj8 = this.A04;
                C38321qM c38321qM = (C38321qM) this.A02;
                viewOnAttachStateChangeListenerC110564yT.A08(new C65713Tsm(0, c38321qM, obj8, c75113Zb));
                viewOnAttachStateChangeListenerC110564yT.A04 = c38321qM;
                viewOnAttachStateChangeListenerC110564yT.A05 = c75113Zb;
                viewOnAttachStateChangeListenerC110564yT.A07 = ((C76293bZ) this.A01).A02;
                C75113Zb c75113Zb2 = (C75113Zb) this.A03;
                C19260xA c19260xA2 = new C19260xA();
                if (c19260xA != null) {
                    c19260xA2.A0C(AbstractC11490j8.A03(c19260xA));
                }
                if (c38321qM.A0C.getMezqlToken() != null) {
                    C19260xA.A00(c19260xA2, c38321qM.A0C.getMezqlToken(), AbstractC111324zv.A00(125));
                }
                if (c38321qM.A0C.getLoggingInfoToken() != null) {
                    C19260xA.A00(c19260xA2, c38321qM.A0C.getLoggingInfoToken(), "ranking_info_token");
                }
                if (c38321qM.A0C.getConnectionId() != null) {
                    C19260xA.A00(c19260xA2, c38321qM.A0C.getConnectionId(), AbstractC111324zv.A00(4166));
                }
                int i = c75113Zb2.A0W;
                if (i >= 0) {
                    C19260xA.A00(c19260xA2, Integer.valueOf(i), "recs_ix");
                }
                if (c75113Zb2.getPosition() >= 0) {
                    C19260xA.A00(c19260xA2, Integer.valueOf(c75113Zb2.getPosition()), "m_ix");
                }
                viewOnAttachStateChangeListenerC110564yT.A03 = c19260xA2;
                break;
            default:
                Context context2 = (Context) obj;
                C14360o3.A0B(context2, 0);
                C79413go c79413go = C79413go.A00;
                UserSession userSession = ((C79293ga) this.A04).A00;
                C38321qM c38321qM2 = (C38321qM) this.A02;
                return c79413go.A00(context2, userSession, c38321qM2, c38321qM2, (InterfaceC60442pS) this.A01, (C75113Zb) this.A03, (C3YE) obj2);
        }
        return C0eB.A00;
    }
}
