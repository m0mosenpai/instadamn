package X;

import kotlin.Deprecated;

/* renamed from: X.1Ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC23731Ed {
    AbstractC23721Ec A9s(String str, String str2);

    @Deprecated(message = "This function does not perform escaping, and requires the string value to be valid JSON. We shouldn't need this in most cases, in most places we just dump json into a field as normal text.")
    AbstractC23721Ec AA6(String str, String str2);
}
