package com.google.android.play.core.splitinstall.internal;

import X.AbstractC25228BEl;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import X.C2KP;
import X.C48402Kh;
import X.C58411Pup;
import X.C58636Pz7;
import X.N20;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.play.core.splitinstall.zzbh;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class zzl extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1032421521, C0f9.A03(-1800318004));
        return this;
    }

    public static int A00(zzbh zzbhVar, int i) {
        int A03 = C0f9.A03(i);
        zzbhVar.A01.A00.A02(zzbhVar.A00);
        return A03;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A00;
        int i3;
        boolean z;
        int i4;
        int i5;
        int A03 = C0f9.A03(1437407141);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i5 = 1791072272;
                C0f9.A0A(i5, A03);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        zzbp zzbpVar = (zzbp) this;
        int A032 = C0f9.A03(1924091511);
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                zzbpVar.FGn(readInt, bundle);
                z = true;
                i4 = -2010019424;
                break;
            case 3:
                int readInt2 = parcel.readInt();
                AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                A00 = A00((zzbh) zzbpVar, 1934057034);
                C2KP.A02.A03("onCompleteInstall(%d)", AbstractC25228BEl.A1Y(readInt2));
                i3 = 1781361505;
                C0f9.A0A(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle2 = (Bundle) AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                zzbpVar.FFr(readInt3, bundle2);
                z = true;
                i4 = -2010019424;
                break;
            case 5:
                int readInt4 = parcel.readInt();
                AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                A00 = A00((zzbh) zzbpVar, 1182649588);
                C2KP.A02.A03("onGetSession(%d)", AbstractC25228BEl.A1Y(readInt4));
                i3 = 2057390965;
                C0f9.A0A(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 6:
                BaseBundle baseBundle = (BaseBundle) AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                zzbh zzbhVar = (zzbh) zzbpVar;
                A00 = C0f9.A03(-1631494501);
                C48402Kh c48402Kh = zzbhVar.A01.A00;
                C58411Pup c58411Pup = zzbhVar.A00;
                c48402Kh.A02(c58411Pup);
                int i6 = baseBundle.getInt(TraceFieldType.ErrorCode);
                C2KP.A02.A02("onError(%d)", AbstractC25228BEl.A1Y(i6));
                c58411Pup.A02(new N20(i6));
                i3 = 883727599;
                C0f9.A0A(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 7:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                zzbpVar.FGg(createTypedArrayList);
                z = true;
                i4 = -2010019424;
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                zzbpVar.FGY(bundle3);
                z = true;
                i4 = -2010019424;
                break;
            case 9:
                Bundle bundle4 = (Bundle) AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                zzbpVar.FGF(bundle4);
                z = true;
                i4 = -2010019424;
                break;
            case 10:
                AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                A00 = A00((zzbh) zzbpVar, -116363309);
                C2KP.A02.A03("onGetSplitsForAppUpdate", AbstractC58318PtA.A1b());
                i3 = 1512882556;
                C0f9.A0A(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 11:
                AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                A00 = A00((zzbh) zzbpVar, 171597811);
                C2KP.A02.A03("onCompleteInstallForAppUpdate", AbstractC58318PtA.A1b());
                i3 = 1551966624;
                C0f9.A0A(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                A00 = A00((zzbh) zzbpVar, 678463550);
                C2KP.A02.A03("onDeferredLanguageInstall", AbstractC58318PtA.A1b());
                i3 = 653500679;
                C0f9.A0A(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                C58636Pz7.A00(parcel);
                A00 = A00((zzbh) zzbpVar, -1970025888);
                C2KP.A02.A03("onDeferredLanguageUninstall", AbstractC58318PtA.A1b());
                i3 = -1647322115;
                C0f9.A0A(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            default:
                z = false;
                i4 = -1539198318;
                break;
        }
        C0f9.A0A(i4, A032);
        i5 = -783287010;
        C0f9.A0A(i5, A03);
        return z;
    }
}
