package X;

import android.view.View;

/* renamed from: X.3sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86133sk implements InterfaceC16130rD {
    public View A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C57012jc A02;

    public C86133sk(C57012jc c57012jc, int i) {
        this.A02 = c57012jc;
        this.A01 = i;
    }

    @Override // X.InterfaceC16130rD
    public final /* bridge */ /* synthetic */ Object CES(Object obj, C0YR c0yr) {
        View view = this.A00;
        if (view == null) {
            View requireViewById = this.A02.A01().requireViewById(this.A01);
            this.A00 = requireViewById;
            return requireViewById;
        }
        return view;
    }
}
