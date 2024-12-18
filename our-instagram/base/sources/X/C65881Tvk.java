package X;

import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonLiteralSerializer;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonNullSerializer;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

/* renamed from: X.Tvk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65881Tvk implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;

    public C65881Tvk(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return new U6N();
            case 1:
            case 2:
            default:
                return null;
            case 3:
            case 4:
                return C0eB.A00;
            case 5:
                return new C70809WhP();
            case 6:
                JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
                return JsonPrimitiveSerializer.A00;
            case 7:
                JsonElementSerializer jsonElementSerializer2 = JsonElementSerializer.A00;
                return JsonNullSerializer.A00;
            case 8:
                JsonElementSerializer jsonElementSerializer3 = JsonElementSerializer.A00;
                return JsonLiteralSerializer.A00;
            case 9:
                JsonElementSerializer jsonElementSerializer4 = JsonElementSerializer.A00;
                return JsonObjectSerializer.A00;
            case 10:
                JsonElementSerializer jsonElementSerializer5 = JsonElementSerializer.A00;
                return JsonArraySerializer.A00;
            case 11:
                InterfaceC09390do interfaceC09390do = JsonNull.A01;
                return JsonNullSerializer.A01;
        }
    }
}
