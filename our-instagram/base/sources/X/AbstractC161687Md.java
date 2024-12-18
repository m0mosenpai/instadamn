package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7Md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161687Md extends C3OO implements InterfaceC161697Me, InterfaceC161707Mf {
    public C7VC A00;

    public void A02() {
    }

    public abstract void A03(C7VC c7vc);

    public boolean A01() {
        if (!(this instanceof C7N7) && !(this instanceof C161747Mj) && !(this instanceof C162357Ox) && !(this instanceof C162367Oy) && !(this instanceof C75Z)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC161697Me
    public final boolean AG9() {
        if ((this instanceof AbstractC161727Mh) || (this instanceof C1584979j)) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161697Me) {
                return ((InterfaceC161697Me) obj).AG9();
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // X.InterfaceC161697Me
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AGA(android.view.MotionEvent r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.AbstractC161727Mh
            if (r0 == 0) goto L2a
            r1 = r2
            X.7Mh r1 = (X.AbstractC161727Mh) r1
            boolean r0 = r1 instanceof X.C7D9
            if (r0 == 0) goto L27
            boolean r0 = r1.AG9()
            if (r0 == 0) goto L25
            X.3OO r0 = r1.A00
            X.7SP r0 = (X.C7SP) r0
            X.7QD r1 = r0.A0M
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.voice.VoiceContentViewHolder<*>"
            X.C14360o3.A0C(r1, r0)
            X.JTm r1 = (X.C43678JTm) r1
            boolean r1 = r1.Eiq(r3)
            r0 = 1
            if (r1 == 0) goto L26
        L25:
            r0 = 0
        L26:
            return r0
        L27:
            X.3OO r1 = r1.A00
            goto L33
        L2a:
            boolean r0 = r2 instanceof X.C1584979j
            if (r0 == 0) goto L25
            r0 = r2
            X.7Mc r0 = (X.AbstractC161677Mc) r0
            X.3OO r1 = r0.A00
        L33:
            boolean r0 = r1 instanceof X.InterfaceC161697Me
            if (r0 == 0) goto L25
            X.7Me r1 = (X.InterfaceC161697Me) r1
            boolean r0 = r1.AGA(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC161687Md.AGA(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC161707Mf
    public void APo(MotionEvent motionEvent) {
        if (this instanceof AbstractC161727Mh) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161707Mf) {
                ((InterfaceC161707Mf) obj).APo(motionEvent);
            }
        }
    }

    @Override // X.InterfaceC161697Me
    public final Integer C4a() {
        if ((this instanceof C1584979j) || (this instanceof AbstractC161727Mh)) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161697Me) {
                return ((InterfaceC161697Me) obj).C4a();
            }
        }
        return C05F.A00;
    }

    @Override // X.InterfaceC161697Me
    public final float C4c() {
        if ((this instanceof C1584979j) || (this instanceof AbstractC161727Mh)) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161697Me) {
                return ((InterfaceC161697Me) obj).C4c();
            }
            return 2.1474836E9f;
        }
        return 2.1474836E9f;
    }

    @Override // X.InterfaceC161697Me
    public final List CGY() {
        if ((this instanceof C1584979j) || (this instanceof AbstractC161727Mh)) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161697Me) {
                return ((InterfaceC161697Me) obj).CGY();
            }
        }
        return Collections.emptyList();
    }

    @Override // X.InterfaceC161697Me
    public final List CGZ() {
        if ((this instanceof C1584979j) || (this instanceof AbstractC161727Mh)) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161697Me) {
                return ((InterfaceC161697Me) obj).CGZ();
            }
        }
        return Collections.emptyList();
    }

    @Override // X.InterfaceC161697Me
    public final void DCG(Canvas canvas, Integer num, float f) {
        if ((this instanceof C1584979j) || (this instanceof AbstractC161727Mh)) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161697Me) {
                ((InterfaceC161697Me) obj).DCG(canvas, num, f);
            }
        }
    }

    @Override // X.InterfaceC161697Me
    public final void Drc(Integer num) {
        if ((this instanceof AbstractC161727Mh) || (this instanceof C1584979j)) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161697Me) {
                ((InterfaceC161697Me) obj).Drc(num);
            }
        }
    }

    @Override // X.InterfaceC161707Mf
    public boolean Eiq(MotionEvent motionEvent) {
        if (this instanceof AbstractC161727Mh) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161707Mf) {
                return ((InterfaceC161707Mf) obj).Eiq(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Ej5() {
        if (this instanceof AbstractC161727Mh) {
            Object obj = ((AbstractC161677Mc) this).A00;
            if (obj instanceof InterfaceC161707Mf) {
                return ((InterfaceC161707Mf) obj).Ej5();
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC161707Mf
    public void DBy(float f, float f2) {
        if (A01()) {
            this.itemView.setTranslationX(f);
        }
    }

    @Override // X.C3OO
    public final String toString() {
        return AnonymousClass001.A0R(getClass().getName(), super.toString());
    }
}
