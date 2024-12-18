package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.fido.fido2.api.common.zzq;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.internal.gtm.zzbk;
import com.google.android.gms.internal.location.zzac;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbg;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzn;
import com.google.android.gms.internal.mlkit_vision_text_common.zznl;
import com.google.android.gms.internal.mlkit_vision_text_common.zznr;
import com.google.android.gms.internal.mlkit_vision_text_common.zznt;
import com.google.android.gms.internal.mlkit_vision_text_common.zznv;
import com.google.android.gms.internal.mlkit_vision_text_common.zznx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.android.gms.internal.p002authapi.zbp;
import com.google.android.gms.internal.p002authapi.zbu;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.internal.vision.zzao;
import com.google.android.gms.internal.vision.zzfz;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.zzay;
import com.google.android.gms.location.zzbd;
import com.google.android.gms.location.zzo;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.zzi;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzh;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.vision.barcode.Barcode;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.SlC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63471SlC implements Parcelable.Creator {
    public final int A00;

    public C63471SlC(int i) {
        this.A00 = i;
    }

    public static C63471SlC A00(int i) {
        return new C63471SlC(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1654
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r29) {
        /*
            Method dump skipped, instructions count: 7144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63471SlC.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    @Deprecated
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new COSEAlgorithmIdentifier[i];
            case 1:
                return new zzq[i];
            case 2:
                return new zzs[i];
            case 3:
                return new zzu[i];
            case 4:
                return new ErrorCode[i];
            case 5:
                return new FidoAppIdExtension[i];
            case 6:
                return new FidoCredentialDetails[i];
            case 7:
                return new ChannelIdValue.ChannelIdValueType[i];
            case 8:
                return new ChannelIdValue[i];
            case 9:
                return new com.google.android.gms.fido.u2f.api.common.ErrorCode[i];
            case 10:
                return new ErrorResponseData[i];
            case 11:
                return new KeyHandle[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new ProtocolVersion[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new RegisterRequest[i];
            case 14:
                return new RegisterRequestParams[i];
            case Process.SIGTERM /* 15 */:
                return new RegisterResponseData[i];
            case 16:
                return new RegisteredKey[i];
            case 17:
                return new SignRequestParams[i];
            case 18:
                return new SignResponseData[i];
            case Process.SIGSTOP /* 19 */:
                return new zbp[i];
            case 20:
                return new zbu[i];
            case 21:
                return new zzaq[i];
            case 22:
                return new zzav[i];
            case 23:
                return new zzax[i];
            case 24:
                return new zzaz[i];
            case 25:
                return new zzbb[i];
            case 26:
                return new zzbw[i];
            case 27:
                return new zzr[i];
            case 28:
                return new zzbk[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new zzac[i];
            case 30:
                return new zzbc[i];
            case 31:
                return new zzbe[i];
            case 32:
                return new zzbg[i];
            case 33:
                return new zzj[i];
            case 34:
                return new zzl[i];
            case 35:
                return new zzd[i];
            case 36:
                return new zzf[i];
            case 37:
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzl[i];
            case 38:
                return new zznl[i];
            case 39:
                return new zznr[i];
            case 40:
                return new zznt[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new zznv[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new zznx[i];
            case 43:
                return new zzn[i];
            case 44:
                return new zzp[i];
            case 45:
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzr[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new zzab[i];
            case 47:
                return new zzah[i];
            case 48:
                return new zzaj[i];
            case 49:
                return new zzal[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new zzam[i];
            case 51:
                return new zzao[i];
            case 52:
                return new zzfz[i];
            case 53:
                return new zzk[i];
            case 54:
                return new com.google.android.gms.internal.vision.zzs[i];
            case 55:
                return new PlaceReport[i];
            case 56:
                return new GeofencingRequest[i];
            case 57:
                return new LocationAvailability[i];
            case 58:
                return new LocationRequest[i];
            case 59:
                return new LocationResult[i];
            case 60:
                return new zzay[i];
            case 61:
                return new LocationSettingsRequest[i];
            case 62:
                return new LocationSettingsResult[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new LocationSettingsStates[i];
            case 64:
                return new zzbd[i];
            case 65:
                return new com.google.android.gms.location.zzbe[i];
            case 66:
                return new ActivityRecognitionResult[i];
            case 67:
                return new ActivityTransition[i];
            case 68:
                return new ActivityTransitionEvent[i];
            case 69:
                return new ActivityTransitionRequest[i];
            case 70:
                return new ActivityTransitionResult[i];
            case 71:
                return new DetectedActivity[i];
            case 72:
                return new zzo[i];
            case 73:
                return new Configuration[i];
            case 74:
                return new ExperimentTokens[i];
            case 75:
                return new zzi[i];
            case 76:
                return new zza[i];
            case 77:
                return new HarmfulAppsData[i];
            case 78:
                return new com.google.android.gms.safetynet.zzd[i];
            case 79:
                return new com.google.android.gms.safetynet.zzf[i];
            case 80:
                return new zzh[i];
            case 81:
                return new SafeBrowsingData[i];
            case 82:
                return new zaa[i];
            case 83:
                return new zag[i];
            case 84:
                return new zai[i];
            case 85:
                return new zak[i];
            case 86:
                return new Barcode.Address[i];
            case 87:
                return new Barcode[i];
            case 88:
                return new Barcode.CalendarDateTime[i];
            case 89:
                return new Barcode.ContactInfo[i];
            case 90:
                return new Barcode.CalendarEvent[i];
            case 91:
                return new Barcode.Email[i];
            case 92:
                return new Barcode.DriverLicense[i];
            case 93:
                return new Barcode.PersonName[i];
            case 94:
                return new Barcode.GeoPoint[i];
            case 95:
                return new Barcode.Sms[i];
            case 96:
                return new Barcode.Phone[i];
            case 97:
                return new Barcode.WiFi[i];
            case 98:
                return new Barcode.UrlBookmark[i];
            default:
                return new com.google.android.gms.vision.face.internal.client.zza[i];
        }
    }
}
