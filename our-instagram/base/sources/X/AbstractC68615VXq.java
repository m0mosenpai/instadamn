package X;

import java.lang.annotation.Annotation;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonClassDiscriminator;

/* renamed from: X.VXq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68615VXq {
    public static final String A00(SerialDescriptor serialDescriptor, AbstractC73763Sg abstractC73763Sg) {
        C14360o3.A0B(serialDescriptor, 0);
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return abstractC73763Sg.A00.A01;
    }
}
