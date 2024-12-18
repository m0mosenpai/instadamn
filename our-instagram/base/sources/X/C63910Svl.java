package X;

import android.os.Looper;
import android.os.Message;

/* renamed from: X.Svl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63910Svl implements InterfaceC88013w9 {
    public final int A00;
    public final C88033wB A01 = new C88033wB();

    @Override // X.InterfaceC88013w9
    public final void EnF(Message message) {
        C88033wB c88033wB;
        C14360o3.A0B(message, 0);
        int i = this.A00;
        if (i == 1) {
            c88033wB = this.A01;
        } else {
            if (i != 2) {
                return;
            }
            c88033wB = this.A01;
            c88033wB.A05(message);
        }
        c88033wB.A02();
    }

    @Override // X.InterfaceC88013w9
    public final void EnU(Looper looper, String str) {
    }

    @Override // X.InterfaceC88013w9
    public final void AVg(Message message) {
        C88033wB c88033wB;
        int i = this.A00;
        if (i == 1) {
            c88033wB = this.A01;
        } else {
            if (i != 2) {
                return;
            }
            c88033wB = this.A01;
            c88033wB.A03();
        }
        c88033wB.A04();
    }

    @Override // X.InterfaceC88013w9
    public final void AVj() {
        C88033wB c88033wB;
        int i = this.A00;
        if (i == 1) {
            c88033wB = this.A01;
        } else {
            if (i != 2) {
                return;
            }
            c88033wB = this.A01;
            c88033wB.A03();
        }
        c88033wB.A04();
    }

    @Override // X.InterfaceC88013w9
    public final void Ena() {
        C88033wB c88033wB;
        int i = this.A00;
        if (i == 1) {
            c88033wB = this.A01;
        } else {
            if (i != 2) {
                return;
            }
            c88033wB = this.A01;
            c88033wB.A0A = true;
        }
        c88033wB.A02();
    }

    public C63910Svl(int i) {
        this.A00 = i;
    }
}
