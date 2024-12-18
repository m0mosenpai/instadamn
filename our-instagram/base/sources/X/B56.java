package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel", f = "ClipsCreationViewModel.kt", i = {0, 0, 0, 0, 0, 0}, l = {1360}, m = "generateClipsStickerAudioForCutoutStickers", n = {"this", PublicKeyCredentialControllerUtility.JSON_KEY_ID, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "audioDurationMs", "intervalStartTimeMs", "intervalDurationMs"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2"})
/* loaded from: classes4.dex */
public final class B56 extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ ClipsCreationViewModel A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B56(ClipsCreationViewModel clipsCreationViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = clipsCreationViewModel;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A03 |= Integer.MIN_VALUE;
        return this.A08.A0J(null, null, null, null, this, 0, 0, 0);
    }
}
