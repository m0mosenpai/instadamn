package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderDelegateBridge;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.camerashare.CameraShareServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.haptic.HapticServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.locale.LocaleServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.memoryinfo.MemoryInfoServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.voiceinteraction.VoiceInteractionServiceConfigurationHybrid;

/* renamed from: X.8zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203838zs {
    public final ServiceConfiguration A00() {
        int i;
        AvatarsDataProviderDelegateBridge avatarsDataProviderDelegateBridge;
        if (this instanceof C203888zz) {
            return new CameraControlServiceConfigurationHybrid((C203888zz) this);
        }
        if (this instanceof C90a) {
            return new VoiceInteractionServiceConfigurationHybrid((C90a) this);
        }
        if (this instanceof C8zr) {
            return new UIControlServiceConfigurationHybrid((C8zr) this);
        }
        if (this instanceof C2039490h) {
            return new TouchGesturesDataProviderConfigurationHybrid((C2039490h) this);
        }
        if (this instanceof C90U) {
            return new MemoryInfoServiceConfigurationHybrid((C90U) this);
        }
        if (this instanceof C90T) {
            return new LocaleServiceConfigurationHybrid((C90T) this);
        }
        if (this instanceof AnonymousClass909) {
            return new InstructionServiceConfigurationHybrid((AnonymousClass909) this);
        }
        if (this instanceof C90X) {
            return new HapticServiceConfigurationHybrid((C90X) this);
        }
        if (this instanceof GalleryPickerServiceConfiguration) {
            return new GalleryPickerServiceConfigurationHybrid((GalleryPickerServiceConfiguration) this);
        }
        if (this instanceof C90L) {
            return new ExternalAssetProviderConfigurationHybrid((C90L) this);
        }
        if (this instanceof AnonymousClass901) {
            return new CaptureEventServiceConfigurationHybrid((AnonymousClass901) this);
        }
        if (this instanceof C90W) {
            return new MusicServiceConfigurationHybrid((C90W) this);
        }
        if (this instanceof C9Y0) {
            return new CameraShareServiceConfigurationHybrid((C9Y0) this);
        }
        if (this instanceof C9Y5) {
            C9Y5 c9y5 = (C9Y5) this;
            AvatarsDataProviderConfigurationHybrid avatarsDataProviderConfigurationHybrid = AvatarsDataProviderConfigurationHybrid.$redex_init_class;
            String str = c9y5.A04;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = c9y5.A03;
            if (str3 != null) {
                str2 = str3;
            }
            switch (c9y5.A02.intValue()) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                default:
                    i = 0;
                    break;
            }
            YPu yPu = c9y5.A00;
            if (yPu != null) {
                avatarsDataProviderDelegateBridge = new AvatarsDataProviderDelegateBridge(yPu);
            } else {
                avatarsDataProviderDelegateBridge = null;
            }
            AvatarsNativeInputDelegate avatarsNativeInputDelegate = c9y5.A01;
            if (avatarsNativeInputDelegate == null) {
                avatarsNativeInputDelegate = new AvatarsNativeInputDelegate();
            }
            return new ServiceConfiguration(AvatarsDataProviderConfigurationHybrid.initHybrid(str, str2, i, avatarsDataProviderDelegateBridge, avatarsNativeInputDelegate));
        }
        return null;
    }
}
