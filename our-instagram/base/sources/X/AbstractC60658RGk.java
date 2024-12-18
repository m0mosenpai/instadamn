package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbh;
import com.google.android.gms.auth.api.signin.internal.zbj;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbf;
import com.google.android.gms.internal.p002authapi.zbk;
import com.google.android.gms.internal.p002authapi.zbp;
import com.google.android.gms.internal.p002authapi.zbt;
import com.google.android.gms.internal.p002authapi.zbu;
import com.google.android.gms.internal.safetynet.zzg;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzj;
import com.google.android.gms.location.LocationSettingsRequest;

/* renamed from: X.RGk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60658RGk extends BasePendingResult implements InterfaceC65248Tge {
    public final C61S A00;
    public final C61W A01;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A09(InterfaceC1340863s interfaceC1340863s) {
        int A03;
        int i;
        IBinder asBinder;
        ApplicationInfo A0C;
        Bundle bundle;
        try {
            if (this instanceof AbstractC60653RGf) {
                AbstractC60653RGf abstractC60653RGf = (AbstractC60653RGf) this;
                zbt zbtVar = (zbt) ((BaseGmsClient) interfaceC1340863s).A03();
                if (abstractC60653RGf instanceof RKy) {
                    zbk zbkVar = new zbk(abstractC60653RGf);
                    A03 = C0f9.A03(446697625);
                    int A032 = C0f9.A03(1625149835);
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(zbtVar.A00);
                    C0f9.A0A(-135530439, A032);
                    AbstractC58321PtD.A19(zbkVar, obtain);
                    zbtVar.A01(obtain, 4);
                    i = 1009048364;
                } else if (abstractC60653RGf instanceof RL0) {
                    RL0 rl0 = (RL0) abstractC60653RGf;
                    zbk zbkVar2 = new zbk(rl0);
                    zbu zbuVar = new zbu(rl0.A00);
                    A03 = C0f9.A03(273623450);
                    zbtVar.A01(zba.A00(zbkVar2, zbuVar, zbtVar), 2);
                    i = -821565376;
                } else if (abstractC60653RGf instanceof RKz) {
                    RKz rKz = (RKz) abstractC60653RGf;
                    zbf zbfVar = new zbf(rKz);
                    CredentialRequest credentialRequest = rKz.A00;
                    A03 = C0f9.A03(-1184094116);
                    zbtVar.A01(zba.A00(zbfVar, credentialRequest, zbtVar), 1);
                    i = 184478729;
                } else {
                    RL1 rl1 = (RL1) abstractC60653RGf;
                    zbk zbkVar3 = new zbk(rl1);
                    zbp zbpVar = new zbp(rl1.A00);
                    A03 = C0f9.A03(-1558616712);
                    zbtVar.A01(zba.A00(zbkVar3, zbpVar, zbtVar), 3);
                    i = 273468191;
                }
            } else {
                if (this instanceof C60726ROg) {
                    C60726ROg c60726ROg = (C60726ROg) this;
                    RHB rhb = (RHB) interfaceC1340863s;
                    zzg zzgVar = c60726ROg.A00;
                    byte[] bArr = c60726ROg.A02;
                    String str = c60726ROg.A01;
                    if (TextUtils.isEmpty(str)) {
                        str = null;
                        try {
                            Context context = rhb.A00;
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager != null && (A0C = AbstractC58320PtC.A0C(context, packageManager)) != null && (bundle = ((PackageItemInfo) A0C).metaData) != null) {
                                str = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY");
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                    zzj zzjVar = (zzj) ((zzi) rhb.A03());
                    int A033 = C0f9.A03(-1812876441);
                    int A034 = C0f9.A03(-2041824502);
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    C0f9.A0A(1015539355, A034);
                    if (zzgVar == null) {
                        asBinder = null;
                    } else {
                        asBinder = zzgVar.asBinder();
                    }
                    obtain2.writeStrongBinder(asBinder);
                    obtain2.writeByteArray(bArr);
                    obtain2.writeString(str);
                    int A035 = C0f9.A03(-303491184);
                    Parcel obtain3 = Parcel.obtain();
                    try {
                        AbstractC167027dH.A0k(zzjVar.A00, obtain2, obtain3, 7);
                        obtain2.recycle();
                        obtain3.recycle();
                        C0f9.A0A(-634569487, A035);
                        C0f9.A0A(656932770, A033);
                        return;
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain3.recycle();
                        C0f9.A0A(1716373439, A035);
                        throw th;
                    }
                }
                if (this instanceof C60655RGh) {
                    C60655RGh c60655RGh = (C60655RGh) this;
                    BaseGmsClient baseGmsClient = (BaseGmsClient) interfaceC1340863s;
                    LocationSettingsRequest locationSettingsRequest = c60655RGh.A00;
                    baseGmsClient.A07();
                    zzaz zzazVar = new zzaz();
                    int A036 = C0f9.A03(-1680838155);
                    zzazVar.A00 = c60655RGh;
                    C0f9.A0A(-1594797497, A036);
                    zzb zzbVar = (zzb) ((zzal) baseGmsClient.A03());
                    A03 = C0f9.A03(-1136123051);
                    int A037 = C0f9.A03(489795492);
                    Parcel obtain4 = Parcel.obtain();
                    obtain4.writeInterfaceToken(zzbVar.A00);
                    C0f9.A0A(-1050705418, A037);
                    obtain4.writeInt(1);
                    locationSettingsRequest.writeToParcel(obtain4, 0);
                    AbstractC58321PtD.A19(zzazVar, obtain4);
                    obtain4.writeString(null);
                    zzbVar.A00(obtain4, 63);
                    i = -1944852402;
                } else if (this instanceof RG3) {
                    RHD rhd = (RHD) interfaceC1340863s;
                    zba zbaVar = (zba) rhd.A03();
                    zbj zbjVar = new zbj((RG3) this);
                    GoogleSignInOptions googleSignInOptions = rhd.A00;
                    A03 = C0f9.A03(-620025741);
                    zbaVar.A01(zba.A00(zbjVar, googleSignInOptions, zbaVar), 103);
                    i = -756663817;
                } else {
                    RHD rhd2 = (RHD) interfaceC1340863s;
                    zba zbaVar2 = (zba) rhd2.A03();
                    zbh zbhVar = new zbh((RG2) this);
                    GoogleSignInOptions googleSignInOptions2 = rhd2.A00;
                    A03 = C0f9.A03(856895497);
                    zbaVar2.A01(zba.A00(zbhVar, googleSignInOptions2, zbaVar2), 102);
                    i = 1117280424;
                }
            }
            C0f9.A0A(i, A03);
        } catch (DeadObjectException e) {
            A0A(new Status(null, null, e.getLocalizedMessage(), 8));
            throw e;
        } catch (RemoteException e2) {
            A0A(new Status(null, null, e2.getLocalizedMessage(), 8));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC60658RGk(C61W c61w, AbstractC1335861e abstractC1335861e) {
        super(abstractC1335861e);
        C3U5.A03(abstractC1335861e, "GoogleApiClient must not be null");
        C3U5.A03(c61w, "Api must not be null");
        this.A00 = c61w.A01;
        this.A01 = c61w;
    }

    public final void A0A(Status status) {
        C3U5.A08(!AbstractC31175DnJ.A1S(status.A00), "Failed result must not be success");
        A06(A03(status));
    }
}
