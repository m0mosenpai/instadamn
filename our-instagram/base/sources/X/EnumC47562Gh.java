package X;

import com.google.gson.stream.JsonReader;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.2Gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC47562Gh implements InterfaceC47572Gi {
    public static final EnumC47562Gh A00 = new EnumC47562Gh() { // from class: X.2Gj
        @Override // X.InterfaceC47572Gi
        public final /* bridge */ /* synthetic */ Number E8H(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.A0C());
        }
    };
    public static final EnumC47562Gh A01 = new EnumC47562Gh() { // from class: X.2Gk
        @Override // X.InterfaceC47572Gi
        public final Number E8H(JsonReader jsonReader) {
            return new C2HX(jsonReader.A0K());
        }
    };

    public EnumC47562Gh(String str, int i) {
    }
}
