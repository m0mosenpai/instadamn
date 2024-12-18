package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WW2 implements InterfaceC48192Ji {
    public final /* synthetic */ InterfaceC41501vz A00;
    public final /* synthetic */ InterfaceC41501vz A01;

    public WW2(InterfaceC41501vz interfaceC41501vz, InterfaceC41501vz interfaceC41501vz2) {
        this.A01 = interfaceC41501vz;
        this.A00 = interfaceC41501vz2;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [X.17P, java.lang.Object, X.17O] */
    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS c2js;
        C2JS A05;
        long parseLong;
        User user;
        Object vby;
        if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (A05 = c2js.A05(C67058Ufj.class, "xdt_live_active_question_event(input:$input)", -1452445418)) != null) {
            InterfaceC41501vz interfaceC41501vz = this.A01;
            InterfaceC41501vz interfaceC41501vz2 = this.A00;
            String requiredStringField = A05.getRequiredStringField(8, CacheBehaviorLogger.SOURCE);
            C14360o3.A07(requiredStringField);
            try {
                if (requiredStringField.equals("story")) {
                    String requiredStringField2 = A05.getRequiredStringField(4, "story_question_id");
                    C14360o3.A07(requiredStringField2);
                    parseLong = Long.parseLong(requiredStringField2);
                } else {
                    String requiredStringField3 = A05.getRequiredStringField(3, "question_id");
                    C14360o3.A07(requiredStringField3);
                    parseLong = Long.parseLong(requiredStringField3);
                }
                C2JS optionalTreeField = A05.getOptionalTreeField(9, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C59785Qmz.class, 2122535321);
                if (optionalTreeField != null) {
                    ?? obj = new Object();
                    obj.A6o = optionalTreeField.getRequiredStringField(0, "strong_id__");
                    obj.A7e = optionalTreeField.getRequiredStringField(1, AbstractC31186DnV.A00());
                    obj.A16 = new SimpleImageUrl(optionalTreeField.getRequiredStringField(2, "profile_pic_url"));
                    obj.A6l = optionalTreeField.getRequiredStringField(3, "full_name");
                    obj.A42 = Boolean.valueOf(optionalTreeField.getRequiredBooleanField(4, "is_private"));
                    obj.A4b = Boolean.valueOf(optionalTreeField.getRequiredBooleanField(5, "is_verified"));
                    user = new User(obj);
                } else {
                    user = null;
                }
                if (A05.getRequiredBooleanField(2, "is_active")) {
                    long requiredTimeField = A05.getRequiredTimeField(7, "video_timestamp_ms");
                    String optionalStringField = A05.getOptionalStringField(6, "question_body");
                    if (optionalStringField == null) {
                        optionalStringField = "";
                    }
                    vby = new VBZ(user, optionalStringField, A05.getRequiredStringField(1, TraceFieldType.BroadcastId), requiredStringField, requiredTimeField, parseLong);
                } else {
                    vby = new VBY(A05.getRequiredTimeField(7, "video_timestamp_ms"), A05.getRequiredStringField(1, TraceFieldType.BroadcastId), parseLong);
                }
                if (vby instanceof VBZ) {
                    interfaceC41501vz.onEvent(vby);
                } else if (vby instanceof VBY) {
                    interfaceC41501vz2.onEvent(vby);
                }
            } catch (NumberFormatException e) {
                C0K8.A0F("QuestionStickerRepository", "Error converting question ID to Long", e);
            }
        }
    }
}
