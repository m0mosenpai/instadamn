package X;

import androidx.compose.foundation.HoverableNode;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.instagram.compose.ui.capturable.CapturableModifierNode;
import com.instagram.compose.ui.gradientspinner.GradientSpinnerNode;

/* renamed from: X.58J, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C58J implements C58K {
    public int A01;
    public C58J A02;
    public C58J A04;
    public C59U A05;
    public C137686Lp A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public C19L A0A;
    public boolean A0B;
    public boolean A0C;
    public C58J A03 = this;
    public int A00 = -1;

    public final C19L A05() {
        C19L c19l = this.A0A;
        if (c19l == null) {
            C19K A02 = AnonymousClass194.A02(((AndroidComposeView) AbstractC114335Dx.A05(this)).A05.plus(new AnonymousClass197((AnonymousClass195) ((AndroidComposeView) AbstractC114335Dx.A05(this)).A05.get(AnonymousClass195.A00))));
            this.A0A = A02;
            return A02;
        }
        return c19l;
    }

    public final void A06(C58J c58j) {
        if (this instanceof C5AY) {
            C5AY c5ay = (C5AY) this;
            c5ay.A03 = c58j;
            for (C58J c58j2 = c5ay.A00; c58j2 != null; c58j2 = c58j2.A02) {
                c58j2.A06(c58j);
            }
            return;
        }
        this.A03 = c58j;
    }

    public final void A07(C59U c59u) {
        if (this instanceof C5AY) {
            C5AY c5ay = (C5AY) this;
            c5ay.A05 = c59u;
            for (C58J c58j = c5ay.A00; c58j != null; c58j = c58j.A02) {
                c58j.A07(c59u);
            }
            return;
        }
        this.A05 = c59u;
    }

    public void A08() {
        String str;
        if (!(!this.A08)) {
            str = "node attached multiple times";
        } else {
            if (this.A05 != null) {
                this.A08 = true;
                this.A0B = true;
                return;
            }
            str = "attach invoked on a node without a coordinator";
        }
        AbstractC28290Cdc.A01(str);
        throw C00O.createAndThrow();
    }

    public void A09() {
        String str;
        if (!this.A08) {
            str = "Cannot detach a node that is not attached";
        } else if (!(!this.A0B)) {
            str = "Must run runAttachLifecycle() before markAsDetached()";
        } else if (!(!this.A0C)) {
            str = "Must run runDetachLifecycle() before markAsDetached()";
        } else {
            this.A08 = false;
            C19L c19l = this.A0A;
            if (c19l != null) {
                AnonymousClass194.A05(new C58460Pvl(), c19l);
                this.A0A = null;
                return;
            }
            return;
        }
        AbstractC28290Cdc.A01(str);
        throw C00O.createAndThrow();
    }

    public void A0A() {
        C19L A05;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        InterfaceC16620sF c9d3;
        if (this instanceof GradientSpinnerNode) {
            ((GradientSpinnerNode) this).DWO();
            return;
        }
        if (this instanceof C5AX) {
            ((C5AX) this).A00 = true;
            return;
        }
        if (this instanceof AbstractC114345Dz) {
            AbstractC114345Dz abstractC114345Dz = (AbstractC114345Dz) this;
            if (!abstractC114345Dz.A09) {
                AbstractC114345Dz.A00(abstractC114345Dz);
            }
            if (!abstractC114345Dz.A08) {
                return;
            }
            abstractC114345Dz.A0F(abstractC114345Dz.A0D);
            abstractC114345Dz.A0F(abstractC114345Dz.A0E);
            return;
        }
        if (this instanceof C5Zw) {
            A05 = A05();
            interfaceC23621Ds = null;
            i = 15;
        } else {
            if (this instanceof C5E3) {
                C5E3 c5e3 = (C5E3) this;
                if (!c5e3.A02) {
                    return;
                }
                C19L A052 = c5e3.A05();
                C206639Cu c206639Cu = new C206639Cu(c5e3, null, 16);
                c5e3.A01 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A052);
                return;
            }
            if (this instanceof C5DU) {
                C5DU.A01((C5DU) this, true);
                return;
            }
            if (this instanceof C5E0) {
                C5E0 c5e0 = (C5E0) this;
                c5e0.A01 = C6G8.A00;
                c5e0.A04 = false;
                return;
            }
            if (this instanceof C5E2) {
                C5E2.A01((C5E2) this);
                return;
            }
            if (this instanceof C6I9) {
                A05 = A05();
                c9d3 = new C9D3(this, null, 13);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, A05);
            }
            if (this instanceof NestedScrollNode) {
                NestedScrollNode nestedScrollNode = (NestedScrollNode) this;
                NestedScrollDispatcher nestedScrollDispatcher = nestedScrollNode.A01;
                nestedScrollDispatcher.A00 = nestedScrollNode;
                nestedScrollDispatcher.A01 = new C9EV(nestedScrollNode, 20);
                nestedScrollDispatcher.A02 = nestedScrollNode.A05();
                return;
            }
            if (this instanceof C6IZ) {
                C6IZ c6iz = (C6IZ) this;
                c6iz.A00.A02 = c6iz;
                return;
            }
            if (this instanceof C6NT) {
                C6NT c6nt = (C6NT) this;
                AbstractC137676Lo.A00(c6nt, new C9EV(c6nt, 4));
                c6nt.A02 = C138076Nl.A00;
                return;
            }
            if (this instanceof C5E7) {
                ((C5E7) this).A00 = C6G8.A00;
                return;
            }
            if (this instanceof C5E6) {
                ((C5E6) this).DWO();
                return;
            }
            if (this instanceof C5E9) {
                C5E9 c5e9 = (C5E9) this;
                c5e9.A00.A00.A09(c5e9);
                return;
            }
            if (this instanceof C5EA) {
                C5EA c5ea = (C5EA) this;
                c5ea.A0F(c5ea.A00);
                return;
            }
            if (this instanceof CapturableModifierNode) {
                A05 = A05();
                interfaceC23621Ds = null;
                i = 18;
            } else {
                if (this instanceof C5EB) {
                    C5EB.A01((C5EB) this);
                    return;
                }
                if (this instanceof C5EC) {
                    C5EC c5ec = (C5EC) this;
                    c5ec.DWO();
                    c5ec.A0C = new C24721Ip(0);
                    C19L A053 = c5ec.A05();
                    AbstractC23641Du.A05(AnonymousClass191.A00, new PZA(c5ec, (InterfaceC23621Ds) null, 3), A053);
                    return;
                }
                if (this instanceof C5ED) {
                    ((C5ED) this).A02.EUc(1.0f);
                    return;
                } else if (this instanceof C5EE) {
                    ((C5EE) this).DWO();
                    return;
                } else {
                    if (!(this instanceof C5EF)) {
                        return;
                    }
                    ((C5EF) this).DWO();
                    return;
                }
            }
        }
        c9d3 = new C206639Cu(this, interfaceC23621Ds, i);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, A05);
    }

    public void A0B() {
        if (!this.A08) {
            AbstractC28290Cdc.A01("reset() called on an unattached node");
            throw C00O.createAndThrow();
        }
        if (this instanceof C5Zp) {
            C5Zp c5Zp = (C5Zp) this;
            C6OE c6oe = c5Zp.A00;
            if (c6oe != null) {
                c6oe.release();
            }
            c5Zp.A00 = null;
            return;
        }
        if (this instanceof C118855a2) {
            ((C118855a2) this).A01 = false;
            return;
        }
        if (this instanceof C60M) {
            ((C60M) this).A04 = false;
        } else if (this instanceof C60N) {
            ((C60N) this).A03 = false;
        } else {
            if (!(this instanceof C5E0)) {
                return;
            }
            ((C5E0) this).A05.Egh(null);
        }
    }

    public void A0C() {
        String str;
        if (!this.A08) {
            str = "Must run markAsAttached() prior to runAttachLifecycle";
        } else if (!this.A0B) {
            str = "Must run runAttachLifecycle() only once after markAsAttached()";
        } else {
            this.A0B = false;
            A0A();
            this.A0C = true;
            return;
        }
        AbstractC28290Cdc.A01(str);
        throw C00O.createAndThrow();
    }

    public void A0D() {
        String str;
        if (!this.A08) {
            str = "node detached multiple times";
        } else if (this.A05 != null) {
            if (!this.A0C) {
                str = "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()";
            } else {
                this.A0C = false;
                A0E();
                return;
            }
        } else {
            str = "detach invoked on a node without a coordinator";
        }
        AbstractC28290Cdc.A01(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0E() {
        C5EA c5ea;
        C57S c57s;
        if (this instanceof C5AX) {
            ((C5AX) this).A00 = false;
            return;
        }
        if (this instanceof C58Z) {
            C58Z c58z = (C58Z) this;
            int ordinal = c58z.A0G().ordinal();
            if (ordinal != 0 && ordinal != 2) {
                if (ordinal == 1) {
                    C1129758g A00 = C5EJ.A00(c58z);
                    try {
                        if (A00.A00) {
                            C1129758g.A00(A00);
                        }
                        A00.A00 = true;
                        C5EJ.A00(c58z).A01.A09(c58z, EnumC118935aA.Inactive);
                    } finally {
                        C1129758g.A01(A00);
                    }
                }
            } else {
                ((AndroidComposeView) AbstractC114335Dx.A05(c58z)).A0S.AHo(8, true, true, false);
                C5EJ.A01(c58z);
            }
            c58z.A00 = null;
            return;
        }
        if (this instanceof AbstractC114345Dz) {
            AbstractC114345Dz abstractC114345Dz = (AbstractC114345Dz) this;
            abstractC114345Dz.A0I();
            if (abstractC114345Dz.A03 == null) {
                abstractC114345Dz.A02 = null;
            }
            C58K c58k = abstractC114345Dz.A06;
            if (c58k != null) {
                abstractC114345Dz.A0G(c58k);
            }
            abstractC114345Dz.A06 = null;
            return;
        }
        if (this instanceof HoverableNode) {
            HoverableNode.A02((HoverableNode) this);
            return;
        }
        if (this instanceof C6KL) {
            ((C6KL) this).EJp();
            return;
        }
        if (this instanceof C6CI) {
            C28802CnY c28802CnY = ((C6CI) this).A00;
            if (c28802CnY == null) {
                return;
            }
            c28802CnY.A00();
            return;
        }
        if (this instanceof C5DU) {
            C5DU.A00((C5DU) this);
            return;
        }
        if (this instanceof C5E2) {
            C5E2 c5e2 = (C5E2) this;
            AnonymousClass195 anonymousClass195 = c5e2.A07;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            c5e2.A07 = null;
            AnonymousClass195 anonymousClass1952 = c5e2.A08;
            if (anonymousClass1952 != null) {
                anonymousClass1952.AGH(null);
            }
            c5e2.A08 = null;
            return;
        }
        if (this instanceof NestedScrollNode) {
            NestedScrollNode nestedScrollNode = (NestedScrollNode) this;
            NestedScrollDispatcher nestedScrollDispatcher = nestedScrollNode.A01;
            if (nestedScrollDispatcher.A00 != nestedScrollNode) {
                return;
            }
            nestedScrollDispatcher.A00 = null;
            return;
        }
        if (this instanceof DragGestureNode) {
            DragGestureNode dragGestureNode = (DragGestureNode) this;
            dragGestureNode.A04 = false;
            dragGestureNode.A0I();
            return;
        }
        if (this instanceof C6IZ) {
            ((C6IZ) this).A00.A06();
            return;
        }
        if (this instanceof GradientSpinnerNode) {
            ((GradientSpinnerNode) this).A05 = null;
            return;
        }
        if (this instanceof C5E9) {
            C5E9 c5e9 = (C5E9) this;
            c57s = c5e9.A00.A00;
            c5ea = c5e9;
        } else if (this instanceof C5EA) {
            C5EA c5ea2 = (C5EA) this;
            InterfaceC50412MNo interfaceC50412MNo = c5ea2.A00;
            if (!(interfaceC50412MNo instanceof BringIntoViewRequesterImpl)) {
                return;
            }
            C14360o3.A0C(interfaceC50412MNo, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            c57s = ((BringIntoViewRequesterImpl) interfaceC50412MNo).A00;
            c5ea = c5ea2;
        } else {
            if (this instanceof C5EC) {
                C5EC c5ec = (C5EC) this;
                InterfaceC30900DiD interfaceC30900DiD = c5ec.A06;
                if (interfaceC30900DiD != null) {
                    ((C28721CmD) interfaceC30900DiD).A00.dismiss();
                }
                c5ec.A06 = null;
                return;
            }
            if (this instanceof C1130658t) {
                C1130658t c1130658t = (C1130658t) this;
                c1130658t.A01 = null;
                c1130658t.A00 = null;
                return;
            } else {
                if (this instanceof C5EB) {
                    C5EB c5eb = (C5EB) this;
                    AnonymousClass195 anonymousClass1953 = c5eb.A04;
                    if (anonymousClass1953 != null) {
                        anonymousClass1953.AGH(null);
                    }
                    c5eb.A04 = null;
                    return;
                }
                if (!(this instanceof C5ED)) {
                    return;
                }
                C5ED c5ed = (C5ED) this;
                AnonymousClass195 anonymousClass1954 = c5ed.A01;
                if (anonymousClass1954 != null) {
                    anonymousClass1954.AGH(null);
                }
                c5ed.A01 = null;
                return;
            }
        }
        c57s.A0B(c5ea);
    }
}
