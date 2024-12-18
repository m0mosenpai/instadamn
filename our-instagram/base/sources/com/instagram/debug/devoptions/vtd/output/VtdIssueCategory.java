package com.instagram.debug.devoptions.vtd.output;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class VtdIssueCategory {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ VtdIssueCategory[] $VALUES;
    public final String tag;
    public static final VtdIssueCategory ATTACHED = new VtdIssueCategory("ATTACHED", 0, "ATTACHED");
    public static final VtdIssueCategory VISIBILITY = new VtdIssueCategory("VISIBILITY", 1, "VISIBILITY");
    public static final VtdIssueCategory LINEAR_LAYOUT = new VtdIssueCategory("LINEAR_LAYOUT", 2, "LINEAR_LAYOUT");
    public static final VtdIssueCategory MULTI_LAYOUT = new VtdIssueCategory("MULTI_LAYOUT", 3, "MULTI_LAYOUT");

    public static final /* synthetic */ VtdIssueCategory[] $values() {
        return new VtdIssueCategory[]{ATTACHED, VISIBILITY, LINEAR_LAYOUT, MULTI_LAYOUT};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        VtdIssueCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static VtdIssueCategory valueOf(String str) {
        return (VtdIssueCategory) Enum.valueOf(VtdIssueCategory.class, str);
    }

    public static VtdIssueCategory[] values() {
        return (VtdIssueCategory[]) $VALUES.clone();
    }

    public final String getTag() {
        return this.tag;
    }

    public VtdIssueCategory(String str, int i, String str2) {
        this.tag = str2;
    }
}
