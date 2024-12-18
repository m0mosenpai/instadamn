package com.facebookpay.offsite.models.message;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public final class PaymentDetailsUpdatedError extends HashMap<String, PaymentDataError> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof PaymentDataError)) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ PaymentDataError getOrDefault(Object obj, PaymentDataError paymentDataError) {
        if (!(obj instanceof String)) {
            return paymentDataError;
        }
        return (PaymentDataError) super.getOrDefault(obj, (Object) paymentDataError);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return super.remove(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ Set getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return super.values();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(PaymentDataError paymentDataError) {
        return super.containsValue((Object) paymentDataError);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ PaymentDataError get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (PaymentDataError) super.get(obj);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof PaymentDataError)) {
            return false;
        }
        return super.remove(obj, obj2);
    }

    public /* bridge */ PaymentDataError get(String str) {
        return (PaymentDataError) super.get((Object) str);
    }

    public /* bridge */ PaymentDataError getOrDefault(String str, PaymentDataError paymentDataError) {
        return (PaymentDataError) super.getOrDefault((Object) str, (String) paymentDataError);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ PaymentDataError remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (PaymentDataError) super.remove(obj);
    }

    public /* bridge */ boolean remove(String str, PaymentDataError paymentDataError) {
        return super.remove((Object) str, (Object) paymentDataError);
    }

    public /* bridge */ PaymentDataError remove(String str) {
        return (PaymentDataError) super.remove((Object) str);
    }
}
