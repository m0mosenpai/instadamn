package androidx.credentials.playservices;

import X.AbstractC1335861e;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.AbstractC58320PtC;
import X.AbstractC58437PvG;
import X.AbstractC61270Rkg;
import X.AbstractC61271Rkh;
import X.C1335961f;
import X.C14360o3;
import X.C3U5;
import X.C5KS;
import X.C62471SCy;
import X.C62947SYp;
import X.C64218T4s;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC58096PpL;
import X.InterfaceC65406Tjd;
import X.InterfaceC65424Tjv;
import X.InterfaceC65463Tkf;
import X.Q6G;
import X.Q6H;
import X.RGZ;
import X.SA3;
import X.SH5;
import X.SWk;
import X.YO1;
import android.content.Context;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbbd;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class CredentialProviderPlayServicesImpl implements InterfaceC58096PpL {
    public static final Companion Companion = new Object();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final String TAG = "PlayServicesImpl";
    public final Context context;
    public GoogleApiAvailability googleApiAvailability;

    /* loaded from: classes10.dex */
    public final class Companion {
        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, InterfaceC16820sZ interfaceC16820sZ) {
            C14360o3.A0B(interfaceC16820sZ, 1);
            if (!cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                interfaceC16820sZ.invoke();
            }
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(C62471SCy c62471SCy) {
            C14360o3.A0B(c62471SCy, 0);
            Iterator it = c62471SCy.A00.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return false;
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                return true;
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        C14360o3.A0B(context, 1);
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C14360o3.A07(googleApiAvailability);
        this.googleApiAvailability = googleApiAvailability;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    public static final void onClearCredential$lambda$0(InterfaceC16660sJ interfaceC16660sJ, Object obj) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        interfaceC16660sJ.invoke(obj);
    }

    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf, Exception exc) {
        AbstractC25233BEq.A0w(2, executor, interfaceC65463Tkf, exc);
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(exc, executor, interfaceC65463Tkf));
    }

    @Override // X.InterfaceC58096PpL
    public void onCreateCredential(Context context, SH5 sh5, CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf) {
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0w(1, sh5, executor, interfaceC65463Tkf);
        if (!Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            if (sh5 instanceof Q6H) {
                new CredentialProviderCreatePasswordController(context).invokePlayServices((Q6H) sh5, interfaceC65463Tkf, executor, cancellationSignal);
            } else {
                if (sh5 instanceof Q6G) {
                    new CredentialProviderCreatePublicKeyCredentialController(context).invokePlayServices((Q6G) sh5, interfaceC65463Tkf, executor, cancellationSignal);
                    return;
                }
                throw AbstractC166987dD.A1D("Create Credential request is unsupported, not password or publickeycredential");
            }
        }
    }

    public /* synthetic */ void onGetCredential(Context context, AbstractC61271Rkh abstractC61271Rkh, CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf) {
    }

    @Override // X.InterfaceC58096PpL
    public void onGetCredential(Context context, C62471SCy c62471SCy, CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf) {
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0w(1, c62471SCy, executor, interfaceC65463Tkf);
        Companion companion = Companion;
        if (!companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            companion.isGetSignInIntentRequest$credentials_play_services_auth_release(c62471SCy);
            new CredentialProviderBeginSignInController(context).invokePlayServices(c62471SCy, interfaceC65463Tkf, executor, cancellationSignal);
        }
    }

    public /* synthetic */ void onPrepareCredential(C62471SCy c62471SCy, CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf) {
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        C14360o3.A0B(googleApiAvailability, 0);
        this.googleApiAvailability = googleApiAvailability;
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.A03(context, MIN_GMS_APK_VERSION);
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // X.InterfaceC58096PpL
    public boolean isAvailableOnDevice() {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        Log.w(TAG, AbstractC167017dG.A0n(new ConnectionResult(isGooglePlayServicesAvailable), "Connection with Google Play Services was not successful. Connection result is: ", AbstractC166987dD.A1C()));
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.T4s, java.lang.Object] */
    public void onClearCredential(AbstractC61270Rkg abstractC61270Rkg, final CancellationSignal cancellationSignal, final Executor executor, final InterfaceC65463Tkf interfaceC65463Tkf) {
        AbstractC167017dG.A1R(executor, interfaceC65463Tkf);
        if (!Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            Context context = this.context;
            C3U5.A02(context);
            final RGZ rgz = new RGZ(context, (C64218T4s) new Object());
            AbstractC58320PtC.A1E(rgz.A01.getSharedPreferences("com.google.android.gms.signin", 0));
            Set set = AbstractC1335861e.A00;
            synchronized (set) {
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((AbstractC1335861e) it.next()).A0A();
            }
            C1335961f.A03();
            C62947SYp A00 = SWk.A00();
            A00.A03 = new Feature[]{SA3.A01};
            A00.A01 = new InterfaceC65406Tjd() { // from class: X.T5F
                @Override // X.InterfaceC65406Tjd
                public final void accept(Object obj, Object obj2) {
                    RGZ rgz2 = RGZ.this;
                    zbbd zbbdVar = new zbbd((C58411Pup) obj2);
                    zba zbaVar = (zba) ((BaseGmsClient) obj).A03();
                    String str = rgz2.A00;
                    int A03 = C0f9.A03(-937287152);
                    int A032 = C0f9.A03(1625149835);
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(zbaVar.A00);
                    C0f9.A0A(-135530439, A032);
                    AbstractC58321PtD.A19(zbbdVar, obtain);
                    obtain.writeString(str);
                    zbaVar.A01(obtain, 2);
                    C0f9.A0A(-718293137, A03);
                }
            };
            A00.A02 = false;
            C5KS A002 = C62947SYp.A00(rgz, A00, 1554, 1);
            final CredentialProviderPlayServicesImpl$onClearCredential$1 credentialProviderPlayServicesImpl$onClearCredential$1 = new CredentialProviderPlayServicesImpl$onClearCredential$1(cancellationSignal, executor, interfaceC65463Tkf);
            A002.A04(new YO1() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
                @Override // X.YO1
                public final void onSuccess(Object obj) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(InterfaceC16660sJ.this, obj);
                }
            }, AbstractC58437PvG.A00);
            A002.A0A(new InterfaceC65424Tjv() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
                @Override // X.InterfaceC65424Tjv
                public final void onFailure(Exception exc) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(CredentialProviderPlayServicesImpl.this, cancellationSignal, executor, interfaceC65463Tkf, exc);
                }
            });
        }
    }
}
