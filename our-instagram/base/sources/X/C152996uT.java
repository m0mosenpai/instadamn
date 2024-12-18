package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: X.6uT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152996uT extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C152996uT(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1814628622);
        Object tag = view.getTag();
        tag.getClass();
        AbstractC153236ur.A02((C1571273r) obj, (C153276uw) tag, (EnumC153216up) obj2);
        C0f9.A0A(-960849321, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1104655762);
        View A00 = AbstractC153236ur.A00(this.A00, viewGroup);
        C0f9.A0A(-395420675, A03);
        return A00;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{Integer.valueOf(i)});
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{obj, obj2});
    }
}
