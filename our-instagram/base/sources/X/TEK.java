package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_text_common.zza;
import com.google.android.gms.internal.mlkit_vision_text_common.zznl;
import com.google.android.gms.internal.mlkit_vision_text_common.zznn;
import com.google.android.gms.internal.mlkit_vision_text_common.zznq;
import com.google.android.gms.internal.mlkit_vision_text_common.zznx;

/* loaded from: classes10.dex */
public final class TEK implements InterfaceC65551TmU {
    public zznn A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final C63010SaY A04;

    public TEK(Context context, C63010SaY c63010SaY) {
        this.A03 = context;
        this.A04 = c63010SaY;
    }

    @Override // X.InterfaceC65551TmU
    public final SVX FFb(C62552SGd c62552SGd) {
        Parcelable parcelable;
        if (this.A00 == null) {
            FFq();
        }
        zznn zznnVar = this.A00;
        C3U5.A02(zznnVar);
        if (!this.A01) {
            try {
                int A03 = C0f9.A03(-131919119);
                zznnVar.A02(zznnVar.A00(), 1);
                C0f9.A0A(-1945397078, A03);
                this.A01 = true;
            } catch (RemoteException e) {
                String valueOf = String.valueOf(this.A04.A00());
                throw new RkG(AbstractC58320PtC.A0w(valueOf.length(), "Failed to init text recognizer ", valueOf), e);
            }
        }
        zznl zznlVar = new zznl(-1, c62552SGd.A00, c62552SGd.A01, SystemClock.elapsedRealtime(), 0);
        Bitmap bitmap = c62552SGd.A02;
        C3U5.A02(bitmap);
        ObjectWrapper objectWrapper = new ObjectWrapper(bitmap);
        try {
            int A032 = C0f9.A03(-563486545);
            Parcel A00 = zznnVar.A00();
            AbstractC58321PtD.A19(objectWrapper, A00);
            A00.writeInt(1);
            zznlVar.writeToParcel(A00, 0);
            Parcel A01 = zznnVar.A01(A00, 3);
            Parcelable.Creator creator = zznx.CREATOR;
            if (A01.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A01);
            }
            A01.recycle();
            C0f9.A0A(-141459495, A032);
            return new SVX((zznx) parcelable);
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(this.A04.A00());
            throw new RkG(AbstractC58320PtC.A0w(valueOf2.length(), "Failed to run text recognizer ", valueOf2), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65551TmU
    public final void FFq() {
        InterfaceC65409Tjg interfaceC65409Tjg;
        String str;
        String str2;
        IInterface zzaVar;
        zznn zznnVar;
        if (this.A00 == null) {
            try {
                Context context = this.A03;
                C63010SaY c63010SaY = this.A04;
                if (c63010SaY.A01()) {
                    interfaceC65409Tjg = C63392SjE.A09;
                } else {
                    interfaceC65409Tjg = C63392SjE.A0A;
                }
                if (true != c63010SaY.A01()) {
                    str = "com.google.android.gms.vision.ocr";
                } else {
                    str = "com.google.mlkit.dynamite.text.latin";
                }
                C63392SjE A04 = C63392SjE.A04(context, interfaceC65409Tjg, str);
                if (true != c63010SaY.A01()) {
                    str2 = "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator";
                } else {
                    str2 = "com.google.mlkit.vision.text.bundled.latin.BundledLatinTextRecognizerCreator";
                }
                IBinder A08 = A04.A08(str2);
                if (A08 == null) {
                    zzaVar = null;
                } else {
                    IInterface queryLocalInterface = A08.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    if (queryLocalInterface instanceof zznq) {
                        zzaVar = (zznq) queryLocalInterface;
                    } else {
                        zzaVar = new zza("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", A08);
                        C0f9.A0A(-630259893, C0f9.A03(1458534025));
                    }
                }
                ObjectWrapper objectWrapper = new ObjectWrapper(context);
                zza zzaVar2 = (zza) zzaVar;
                int A03 = C0f9.A03(-796736909);
                Parcel A00 = zzaVar2.A00();
                AbstractC58321PtD.A19(objectWrapper, A00);
                Parcel A01 = zzaVar2.A01(A00, 1);
                IBinder readStrongBinder = A01.readStrongBinder();
                if (readStrongBinder == null) {
                    zznnVar = 0;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
                    if (queryLocalInterface2 instanceof zznn) {
                        zznnVar = (zznn) queryLocalInterface2;
                    } else {
                        zza zzaVar3 = new zza("com.google.mlkit.vision.text.aidls.ITextRecognizer", readStrongBinder);
                        C0f9.A0A(1084453230, C0f9.A03(559714607));
                        zznnVar = zzaVar3;
                    }
                }
                A01.recycle();
                C0f9.A0A(-1044201980, A03);
                this.A00 = zznnVar;
            } catch (RjO e) {
                C63010SaY c63010SaY2 = this.A04;
                if (!c63010SaY2.A01()) {
                    if (!this.A02) {
                        AbstractC62229S3a.A00(this.A03);
                        this.A02 = true;
                    }
                    throw new RkG("Waiting for the text optional module to be downloaded. Please wait.", 14);
                }
                throw new RkG(String.format("Failed to load text module %s. %s", c63010SaY2.A00(), e.getMessage()), e);
            } catch (RemoteException e2) {
                String valueOf = String.valueOf(this.A04.A00());
                throw new RkG(AbstractC58320PtC.A0w(valueOf.length(), "Failed to create text recognizer ", valueOf), e2);
            }
        }
    }

    @Override // X.InterfaceC65551TmU
    public final void FFz() {
        zznn zznnVar = this.A00;
        if (zznnVar != null) {
            try {
                int A03 = C0f9.A03(967230893);
                zznnVar.A02(zznnVar.A00(), 2);
                C0f9.A0A(-474967504, A03);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(this.A04.A00());
                android.util.Log.e("DecoupledTextDelegate", AbstractC58320PtC.A0w(valueOf.length(), "Failed to release text recognizer ", valueOf), e);
            }
            this.A00 = null;
        }
        this.A01 = false;
    }
}
