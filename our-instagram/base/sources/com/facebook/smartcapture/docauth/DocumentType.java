package com.facebook.smartcapture.docauth;

import X.AbstractC12190kN;
import X.MSY;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class DocumentType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ DocumentType[] $VALUES;
    public static final DocumentType ID1 = new DocumentType("ID1", 0, "ID1");
    public static final DocumentType ID2 = new DocumentType("ID2", 1, "ID2");
    public static final DocumentType ID3 = new DocumentType("ID3", 2, "ID3");
    public final String type;

    public static final /* synthetic */ DocumentType[] $values() {
        return new DocumentType[]{ID1, ID2, ID3};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* loaded from: classes10.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                MSY.A1I(DocumentType.ID1, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                MSY.A1J(DocumentType.ID2, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MSY.A1K(DocumentType.ID3, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        DocumentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static DocumentType valueOf(String str) {
        return (DocumentType) Enum.valueOf(DocumentType.class, str);
    }

    public static DocumentType[] values() {
        return (DocumentType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    public DocumentType(String str, int i, String str2) {
        this.type = str2;
    }

    public final float getWidthToHeightRatio() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 1.5857725f;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return 1.5857725f;
            }
            return 1.4204545f;
        }
        return 1.418919f;
    }
}
