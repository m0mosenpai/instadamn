package com.facebook.common.util;

/* loaded from: classes.dex */
public enum TriState {
    YES,
    NO,
    UNSET;

    public static TriState fromDbValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return UNSET;
            }
            return NO;
        }
        return YES;
    }

    public static TriState valueOf(Boolean bool) {
        if (bool != null) {
            return valueOf(bool.booleanValue());
        }
        return UNSET;
    }

    public boolean isSet() {
        if (this == UNSET) {
            return false;
        }
        return true;
    }

    public boolean asBoolean(boolean z) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized TriState value: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString());
            }
            return z;
        }
        return false;
    }

    public Boolean asBooleanObject() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized TriState value: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString());
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public int getDbValue() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        return 3;
    }

    public boolean asBoolean() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized TriState value: ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("No boolean equivalent for UNSET");
    }

    public static TriState valueOf(boolean z) {
        if (z) {
            return YES;
        }
        return NO;
    }
}
