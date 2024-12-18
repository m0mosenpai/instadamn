package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.common.internal.zzak;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.deviceperformance.MediaPerformanceClassResult;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.SlF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63474SlF implements Parcelable.Creator {
    public final int A00;

    public C63474SlF(int i) {
        this.A00 = i;
    }

    public static C63474SlF A01(int i) {
        return new C63474SlF(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1516
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r31) {
        /*
            Method dump skipped, instructions count: 6272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63474SlF.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new BeginSignInRequest[i];
            case 1:
                return new BeginSignInResult[i];
            case 2:
                return new GetPhoneNumberHintIntentRequest[i];
            case 3:
                return new GetSignInIntentRequest[i];
            case 4:
                return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
            case 5:
                return new BeginSignInRequest.PasskeyJsonRequestOptions[i];
            case 6:
                return new BeginSignInRequest.PasskeysRequestOptions[i];
            case 7:
                return new BeginSignInRequest.PasswordRequestOptions[i];
            case 8:
                return new SaveAccountLinkingTokenRequest[i];
            case 9:
                return new SaveAccountLinkingTokenResult[i];
            case 10:
                return new SavePasswordRequest[i];
            case 11:
                return new SavePasswordResult[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new SignInCredential[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new SignInPassword[i];
            case 14:
                return new ProxyRequest[i];
            case Process.SIGTERM /* 15 */:
                return new ProxyResponse[i];
            case 16:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 17:
                return new SignInConfiguration[i];
            case 18:
                return new GoogleSignInAccount[i];
            case Process.SIGSTOP /* 19 */:
                return new GoogleSignInOptions[i];
            case 20:
                return new SignInAccount[i];
            case 21:
                return new RetrieveBytesResponse.BlockstoreData[i];
            case 22:
                return new DeleteBytesRequest[i];
            case 23:
                return new RetrieveBytesRequest[i];
            case 24:
                return new RetrieveBytesResponse[i];
            case 25:
                return new StoreBytesData[i];
            case 26:
                return new AccountChangeEvent[i];
            case 27:
                return new AccountChangeEventsRequest[i];
            case 28:
                return new AccountChangeEventsResponse[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new TokenData[i];
            case 30:
                return new zzc[i];
            case 31:
                return new zze[i];
            case 32:
                return new Scope[i];
            case 33:
                return new BitmapTeleporter[i];
            case 34:
                return new DataHolder[i];
            case 35:
                return new WebImage[i];
            case 36:
                return new ClientIdentity[i];
            case 37:
                return new TelemetryData[i];
            case 38:
                return new MethodInvocation[i];
            case 39:
                return new zat[i];
            case 40:
                return new zav[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new zax[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new zzak[i];
            case 43:
                return new BinderWrapper[i];
            case 44:
                return new ApiFeatureRequest[i];
            case 45:
                return new ModuleAvailabilityResponse[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new ModuleInstallIntentResponse[i];
            case 47:
                return new ModuleInstallResponse[i];
            case 48:
                return new ModuleInstallStatusUpdate[i];
            case 49:
                return new zaa[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new StringToIntConverter[i];
            case 51:
                return new zac[i];
            case 52:
                return new FastJsonResponse$Field[i];
            case 53:
                return new zam[i];
            case 54:
                return new zan[i];
            case 55:
                return new zal[i];
            case 56:
                return new SafeParcelResponse[i];
            case 57:
                return new FavaDiagnosticsEntity[i];
            case 58:
                return new WakeLockEvent[i];
            case 59:
                return new zzo[i];
            case 60:
                return new zzq[i];
            case 61:
                return new zzs[i];
            case 62:
                return new MediaPerformanceClassResult[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new Transport[i];
            case 64:
                return new Attachment[i];
            case 65:
                return new zzz[i];
            case 66:
                return new zzab[i];
            case 67:
                return new zzad[i];
            case 68:
                return new GoogleThirdPartyPaymentExtension[i];
            case 69:
                return new zzag[i];
            case 70:
                return new zzai[i];
            case 71:
                return new com.google.android.gms.fido.fido2.api.common.zzak[i];
            case 72:
                return new PublicKeyCredentialCreationOptions[i];
            case 73:
                return new PublicKeyCredential[i];
            case 74:
                return new PublicKeyCredentialDescriptor[i];
            case 75:
                return new PublicKeyCredentialParameters[i];
            case 76:
                return new PublicKeyCredentialRequestOptions[i];
            case 77:
                return new PublicKeyCredentialRpEntity[i];
            case 78:
                return new PublicKeyCredentialType[i];
            case 79:
                return new PublicKeyCredentialUserEntity[i];
            case 80:
                return new ResidentKeyRequirement[i];
            case 81:
                return new zzaw[i];
            case 82:
                return new TokenBinding.TokenBindingStatus[i];
            case 83:
                return new TokenBinding[i];
            case 84:
                return new AttestationConveyancePreference[i];
            case 85:
                return new UserVerificationMethodExtension[i];
            case 86:
                return new UserVerificationRequirement[i];
            case 87:
                return new UvmEntries[i];
            case 88:
                return new UvmEntry[i];
            case 89:
                return new AuthenticationExtensionsClientOutputs[i];
            case 90:
                return new AuthenticationExtensions[i];
            case 91:
                return new AuthenticationExtensionsCredPropsOutputs[i];
            case 92:
                return new zzf[i];
            case 93:
                return new zzh[i];
            case 94:
                return new AuthenticatorAssertionResponse[i];
            case 95:
                return new AuthenticatorAttestationResponse[i];
            case 96:
                return new AuthenticatorErrorResponse[i];
            case 97:
                return new AuthenticatorSelectionCriteria[i];
            case 98:
                return new BrowserPublicKeyCredentialCreationOptions[i];
            default:
                return new BrowserPublicKeyCredentialRequestOptions[i];
        }
    }

    public static PendingIntent A00(PendingIntent pendingIntent, Parcel parcel) {
        int readInt = parcel.readInt();
        if (((char) readInt) != 1) {
            AbstractC125725mK.A0C(parcel, readInt);
            return pendingIntent;
        }
        return (PendingIntent) AbstractC125725mK.A04(parcel, PendingIntent.CREATOR, readInt);
    }

    public static boolean A02(Parcel parcel, boolean z) {
        int readInt = parcel.readInt();
        if (((char) readInt) != 1) {
            AbstractC125725mK.A0C(parcel, readInt);
            return z;
        }
        return AbstractC125725mK.A0G(parcel, readInt);
    }
}
