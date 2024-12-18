package com.facebookpay.offsite.models.message;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AuthorizationState {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ AuthorizationState[] $VALUES;
    public static final AuthorizationState SUCCESS = new AuthorizationState("SUCCESS", 0);
    public static final AuthorizationState ERROR = new AuthorizationState("ERROR", 1);
    public static final AuthorizationState PERMITTED = new AuthorizationState("PERMITTED", 2);

    public static final /* synthetic */ AuthorizationState[] $values() {
        return new AuthorizationState[]{SUCCESS, ERROR, PERMITTED};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        AuthorizationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static AuthorizationState valueOf(String str) {
        return (AuthorizationState) Enum.valueOf(AuthorizationState.class, str);
    }

    public static AuthorizationState[] values() {
        return (AuthorizationState[]) $VALUES.clone();
    }

    public AuthorizationState(String str, int i) {
    }
}
