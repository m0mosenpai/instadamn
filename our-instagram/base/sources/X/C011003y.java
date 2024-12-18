package X;

import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: X.03y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C011003y implements InterfaceC224417g {
    public final /* synthetic */ ViewGroup A00;

    public C011003y(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        return new C12500ku(this.A00);
    }
}
