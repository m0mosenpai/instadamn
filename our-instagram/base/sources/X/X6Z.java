package X;

import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes11.dex */
public final class X6Z extends C71822X6a {
    public int A00;
    public final int A01;
    public final List A02;
    public final JsonObject A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6Z(AbstractC73763Sg abstractC73763Sg, JsonObject jsonObject) {
        super(null, null, abstractC73763Sg, jsonObject);
        C14360o3.A0B(jsonObject, 2);
        this.A03 = jsonObject;
        List A0a = AbstractC001800i.A0a(jsonObject.keySet());
        this.A02 = A0a;
        this.A01 = A0a.size() * 2;
        this.A00 = -1;
    }
}
