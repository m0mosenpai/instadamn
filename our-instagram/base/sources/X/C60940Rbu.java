package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Rbu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60940Rbu extends C2AG {
    public final int A00;
    public final Object A01;

    public C60940Rbu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00(List list) {
        ArrayList A1E;
        C60927Rbh c60927Rbh = (C60927Rbh) this.A01;
        List list2 = c60927Rbh.A00;
        if (list2 != null) {
            A1E = AbstractC166987dD.A1F(list2);
        } else {
            A1E = AbstractC166987dD.A1E();
        }
        if (list == null) {
            list = AbstractC166987dD.A1E();
        }
        c60927Rbh.A00 = list;
        if (!A1E.equals(list)) {
            InterfaceC65458TkU interfaceC65458TkU = c60927Rbh.A03;
            List list3 = c60927Rbh.A00;
            if (list3 != null && interfaceC65458TkU != null) {
                interfaceC65458TkU.Dtf(list3);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        AbstractC71443Ii abstractC71443Ii;
        switch (this.A00) {
            case 0:
                SHs sHs = (SHs) this.A01;
                synchronized (sHs) {
                    C59732oG ARB = sHs.A02.ARB("previous_session");
                    C0XO c0xo = (C0XO) sHs.A00.A00();
                    if (ARB.A00 != null && c0xo != null) {
                        try {
                            abstractC71443Ii = (AbstractC71443Ii) ARB.A00();
                            try {
                                DataOutputStream dataOutputStream = new DataOutputStream(abstractC71443Ii);
                                try {
                                    C0RQ c0rq = sHs.A01;
                                    dataOutputStream.writeShort(251);
                                    dataOutputStream.writeShort(2);
                                    dataOutputStream.writeLong(c0rq.A00());
                                    c0rq.A01(c0xo, dataOutputStream);
                                    dataOutputStream.writeBoolean(C218914p.A08());
                                    dataOutputStream.flush();
                                    abstractC71443Ii.flush();
                                    abstractC71443Ii.A03();
                                    dataOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        dataOutputStream.close();
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e) {
                                C0w9.A07("BatteryMetricsPersistentCache", e);
                            }
                            abstractC71443Ii.A02();
                        } catch (Throwable th3) {
                            abstractC71443Ii.A02();
                            throw th3;
                        }
                    }
                }
                return null;
            case 1:
                C60927Rbh c60927Rbh = (C60927Rbh) this.A01;
                Context context = c60927Rbh.A01;
                if (context != null) {
                    return C35269Fh4.A02(context, c60927Rbh.A02);
                }
                return AbstractC166987dD.A1E();
            default:
                try {
                    return SXA.A00(((Fragment) this.A01).requireContext());
                } catch (IllegalStateException e2) {
                    onFail(e2);
                    return null;
                }
        }
    }

    @Override // X.C11R
    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 266;
            case 1:
                return C8S8.DEFAULT_SWIPE_ANIMATION_DURATION;
            default:
                return 443;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C2AH
    public final void onFail(Exception exc) {
        String str;
        switch (this.A00) {
            case 0:
                str = "BatteryMetricsPersistentCache";
                C0w9.A07(str, exc);
                return;
            case 1:
                A00(AbstractC166987dD.A1E());
                return;
            default:
                C33225ElD.A02((C33225ElD) this.A01, true);
                str = "omvp_app_updates";
                C0w9.A07(str, exc);
                return;
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                C1GJ.A05(((SHs) this.A01).A03, 267, 3, 600000, true, true);
                return;
            case 1:
                A00((List) obj);
                return;
            default:
                C33225ElD c33225ElD = (C33225ElD) this.A01;
                c33225ElD.A00 = (SXA) obj;
                C33225ElD.A02(c33225ElD, false);
                return;
        }
    }
}
