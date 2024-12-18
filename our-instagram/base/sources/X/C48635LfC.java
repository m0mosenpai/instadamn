package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.File;

/* renamed from: X.LfC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48635LfC implements InterfaceC69913Ca {
    public final int A00;
    public final Object A01;

    public C48635LfC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
        FragmentActivity requireActivity;
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 1:
                C45502KCr c45502KCr = (C45502KCr) this.A01;
                if (c45502KCr.getActivity() == null) {
                    return;
                }
                requireActivity = c45502KCr.requireActivity();
                interfaceC09390do = c45502KCr.A09;
                break;
            case 2:
                C45503KCs c45503KCs = (C45503KCs) this.A01;
                if (c45503KCs.getActivity() == null) {
                    return;
                }
                requireActivity = c45503KCs.requireActivity();
                interfaceC09390do = c45503KCs.A0C;
                break;
            default:
                return;
        }
        AbstractC25231BEo.A0c(requireActivity, interfaceC09390do).A06();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC69913Ca
    public final void En7(File file, int i) {
        Activity activity;
        int i2 = this.A00;
        C14360o3.A0B(file, 0);
        Object obj = this.A01;
        switch (i2) {
            case 1:
            case 2:
                activity = ((Fragment) obj).getActivity();
                if (activity == null) {
                    return;
                }
                LJR.A02(activity, file, i);
                return;
            default:
                activity = (Activity) obj;
                LJR.A02(activity, file, i);
                return;
        }
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        int i2 = this.A00;
        C14360o3.A0B(intent, 0);
        Object obj = this.A01;
        switch (i2) {
            case 1:
            case 2:
                C12260kU.A06((Fragment) obj, intent, i);
                return;
            default:
                C12260kU.A08((Activity) obj, intent, i);
                return;
        }
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }
}
