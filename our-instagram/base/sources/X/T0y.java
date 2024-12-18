package X;

import com.facebook.systrace.SystraceMessage;

/* loaded from: classes10.dex */
public final class T0y implements C1LP {
    public final AbstractC09720ep A00;

    @Override // X.C1LP
    public final C1LP ACW(Object obj, String str) {
        C14360o3.A0B(obj, 1);
        this.A00.A00(obj, str);
        return this;
    }

    @Override // X.C1LP
    public final C1LP ACV(String str, int i) {
        this.A00.A01(str, i);
        return this;
    }

    @Override // X.C1LP
    public final void flush() {
        this.A00.A02();
    }

    public T0y(String str) {
        this.A00 = SystraceMessage.A00(SystraceMessage.A00, str, 1L);
    }
}
