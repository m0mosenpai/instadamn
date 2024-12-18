package com.google.android.gms.common;

import X.C0f9;
import X.C3U5;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class zzj extends zzz {
    public final int A00;

    public abstract byte[] A03();

    @Override // com.google.android.gms.common.internal.zzaa
    public final int FFy() {
        int A03 = C0f9.A03(-1059546480);
        int i = this.A00;
        C0f9.A0A(-959291342, A03);
        return i;
    }

    public final int hashCode() {
        int A03 = C0f9.A03(455940741);
        int i = this.A00;
        C0f9.A0A(-1649393056, A03);
        return i;
    }

    public static byte[] A00(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public zzj(byte[] bArr) {
        int A03 = C0f9.A03(-61322954);
        C3U5.A07(bArr.length == 25);
        this.A00 = Arrays.hashCode(bArr);
        C0f9.A0A(482561318, A03);
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper FG4() {
        int A03 = C0f9.A03(-1049053617);
        ObjectWrapper objectWrapper = new ObjectWrapper(A03());
        C0f9.A0A(694498148, A03);
        return objectWrapper;
    }

    public final boolean equals(Object obj) {
        int i;
        int A03 = C0f9.A03(1186965809);
        if (obj != null && (obj instanceof zzaa)) {
            try {
                zzaa zzaaVar = (zzaa) obj;
                if (zzaaVar.FFy() == this.A00) {
                    IObjectWrapper FG4 = zzaaVar.FG4();
                    if (FG4 == null) {
                        i = 1672189390;
                    } else {
                        boolean equals = Arrays.equals(A03(), (byte[]) ObjectWrapper.A00(FG4));
                        C0f9.A0A(-871447886, A03);
                        return equals;
                    }
                } else {
                    i = -814620244;
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                C0f9.A0A(-1550026125, A03);
                return false;
            }
        } else {
            i = -370635717;
        }
        C0f9.A0A(i, A03);
        return false;
    }
}
