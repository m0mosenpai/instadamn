package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.intent.IntentModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.R2a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60518R2a extends AbstractC62966SZj {
    public final C63347Si4 A00;
    public final List A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.R2r, X.SDh] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.R2q, X.SDh] */
    public C60518R2a(C63347Si4 c63347Si4, ReadableMap readableMap) {
        ArrayList A17;
        ?? c60527R2r;
        this.A00 = c63347Si4;
        ReadableArray array = readableMap.getArray("transforms");
        if (array == null) {
            A17 = AbstractC166987dD.A1E();
        } else {
            int size = array.size();
            A17 = AbstractC25225BEi.A17(size);
            for (int i = 0; i < size; i++) {
                ReadableMap map = array.getMap(i);
                String string = map.getString("property");
                if (C14360o3.A0K(map.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), "animated")) {
                    c60527R2r = new C60526R2q(this);
                    c60527R2r.A00 = string;
                    c60527R2r.A00 = map.getInt("nodeTag");
                } else {
                    c60527R2r = new C60527R2r(this);
                    c60527R2r.A00 = string;
                    c60527R2r.A00 = map.getDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                }
                A17.add(c60527R2r);
            }
        }
        this.A01 = A17;
    }

    @Override // X.AbstractC62966SZj
    public final String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "TransformAnimatedNode[", A1C);
        A1C.append("]: transformConfigs: ");
        return AbstractC166997dE.A0v(this.A01, A1C);
    }
}
