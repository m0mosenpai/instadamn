package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementSerializer;

/* renamed from: X.WzX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71706WzX implements SerialDescriptor {
    public static final C71706WzX A01 = new C71706WzX();
    public final /* synthetic */ SerialDescriptor A00;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List B0p(int i) {
        return this.A00.B0p(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        return this.A00.B0r(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        C14360o3.A0B(str, 0);
        return this.A00.B0t(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        return this.A00.B0v(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return this.A00.B10();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final C3RG BKw() {
        return this.A00.BKw();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        return this.A00.CSy(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CZW() {
        return this.A00.CZW();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.A00.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.A00.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String BtR() {
        return "kotlinx.serialization.json.JsonArray";
    }

    public C71706WzX() {
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        C14360o3.A0B(jsonElementSerializer, 0);
        this.A00 = new C3SG(jsonElementSerializer).A00;
    }
}
