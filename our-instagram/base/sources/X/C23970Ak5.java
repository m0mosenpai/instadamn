package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.TransparentBackgroundModalActivity;

/* renamed from: X.Ak5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23970Ak5 implements InterfaceC191378do {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C23970Ak5(Context context, FragmentActivity fragmentActivity, String str, String str2, boolean z) {
        this.A01 = fragmentActivity;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = context;
    }

    @Override // X.InterfaceC191378do
    public final void onFailure(String str, boolean z) {
        C9GR.A01(this.A00, null, 2131974293, 1);
    }

    @Override // X.InterfaceC191378do
    public final void onSuccess() {
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        boolean z = this.A04;
        Bundle A00 = AbstractC22972AAq.A00();
        if (str != null) {
            A00.putString(AbstractC111324zv.A00(2293), str);
        }
        if (str2 != null) {
            A00.putString(AbstractC111324zv.A00(2291), str2);
        }
        A00.putBoolean(AbstractC111324zv.A00(2292), z);
        A00.putString("dogfooding_assistant_surface", AbstractC111324zv.A00(2910));
        C6XJ.A06(fragmentActivity, A00, TransparentBackgroundModalActivity.class, "bottom_sheet");
    }
}
