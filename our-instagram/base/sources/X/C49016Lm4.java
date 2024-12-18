package X;

import android.text.TextUtils;
import android.view.MotionEvent;

/* renamed from: X.Lm4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49016Lm4 implements C7Q6 {
    public final /* synthetic */ InterfaceC165247aD A00;
    public final /* synthetic */ C49102Lnf A01;

    public C49016Lm4(InterfaceC165247aD interfaceC165247aD, C49102Lnf c49102Lnf) {
        this.A01 = c49102Lnf;
        this.A00 = interfaceC165247aD;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.7Zv, X.7aD] */
    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        KTE kte = (KTE) obj;
        ?? r3 = this.A00;
        if (kte.BCt()) {
            ((InterfaceC164967Zl) r3).Eku(kte.BSy());
            return true;
        }
        String str = kte.A03;
        if (!TextUtils.isEmpty(str)) {
            r3.Cs3(str, false, null);
            return true;
        }
        Boolean bool = kte.A01;
        if (bool != null && bool.booleanValue()) {
            ((InterfaceC165457aY) r3).CrP();
            return true;
        }
        return false;
    }
}
