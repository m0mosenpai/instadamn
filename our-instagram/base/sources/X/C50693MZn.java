package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.state.CreationState;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.MZn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50693MZn implements InterfaceC41501vz {
    public C25671My A00;
    public final Stack A02 = new Stack();
    public Map A01 = AbstractC166987dD.A1G();

    public final CreationState A00() {
        Stack stack = this.A02;
        if (stack.isEmpty()) {
            return null;
        }
        return (CreationState) stack.peek();
    }

    public final void A01(InterfaceC41501vz interfaceC41501vz) {
        this.A00.A01(interfaceC41501vz, C50698MZt.class);
        CreationState creationState = CreationState.A0L;
        CreationState A00 = A00();
        A00.getClass();
        interfaceC41501vz.onEvent(new C50698MZt(new C50695MZq(new C50696MZr()), creationState, A00));
    }

    public final void A02(CreationState creationState, CreationState creationState2, Class cls) {
        Map map = this.A01;
        Map map2 = (Map) map.get(creationState);
        if (map2 == null) {
            map2 = AbstractC166987dD.A1G();
            map.put(creationState, map2);
        }
        map2.put(cls, creationState2);
    }

    public C50693MZn(UserSession userSession, CreationState[] creationStateArr) {
        this.A00 = AbstractC25651Mw.A00(userSession);
        Stack stack = this.A02;
        stack.clear();
        stack.push(creationStateArr[0]);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(1003267307);
        C50695MZq c50695MZq = (C50695MZq) obj;
        int A032 = C0f9.A03(886215928);
        CreationState A00 = A00();
        if (A00 == null) {
            AbstractC12120kG.A01("CreationStateMachine", AnonymousClass001.A0R("previousState is null. cannot handle onEvent ", c50695MZq.A00.A00));
            i = 1458109566;
        } else {
            AbstractC50697MZs abstractC50697MZs = c50695MZq.A00;
            if (abstractC50697MZs instanceof C52497NKq) {
                this.A02.pop();
            } else if (abstractC50697MZs instanceof C52505NKy) {
                CreationState creationState = ((C52505NKy) abstractC50697MZs).A00;
                Stack stack = this.A02;
                if (!stack.contains(creationState)) {
                    i = 366306802;
                } else {
                    while (A00() != creationState) {
                        stack.pop();
                    }
                }
            } else {
                Map map = (Map) this.A01.get(A00);
                if (map == null) {
                    i = -852841992;
                } else {
                    Object obj2 = map.get(abstractC50697MZs.getClass());
                    if (obj2 == null) {
                        i = 1751881249;
                    } else {
                        if ((abstractC50697MZs instanceof NLF) && ((NLF) abstractC50697MZs).A01) {
                            this.A02.clear();
                        }
                        this.A02.push(obj2);
                    }
                }
            }
            CreationState A002 = A00();
            if (A002 != null) {
                this.A00.A05(new C50698MZt(c50695MZq, A00, A002));
            } else {
                AbstractC12120kG.A01("CreationStateMachine", AnonymousClass001.A0R("currentState is null. cannot handle onEvent ", abstractC50697MZs.A00));
            }
            i = 1998990215;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-1993818787, A03);
    }
}
