package com.instagram.debug.devoptions.debughead.data.delegates;

import X.AbstractC12190kN;
import X.C19280xC;
import X.C193668hm;
import kotlin.enums.EnumEntries;

/* loaded from: classes12.dex */
public interface DropFrameDelegate {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes12.dex */
    public final class ScrollStatus {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ ScrollStatus[] $VALUES;
        public static final ScrollStatus START = new ScrollStatus("START", 0);
        public static final ScrollStatus STOP = new ScrollStatus("STOP", 1);

        public static final /* synthetic */ ScrollStatus[] $values() {
            return new ScrollStatus[]{START, STOP};
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        static {
            ScrollStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC12190kN.A00($values);
        }

        public static ScrollStatus valueOf(String str) {
            return (ScrollStatus) Enum.valueOf(ScrollStatus.class, str);
        }

        public static ScrollStatus[] values() {
            return (ScrollStatus[]) $VALUES.clone();
        }

        public ScrollStatus(String str, int i) {
        }
    }

    void onFrameDrop(String str, int i);

    void onRegisterModule(String str);

    void onScrollStatusChange(ScrollStatus scrollStatus);

    void onScrolled(int i, int i2);

    void reportScrollForDebug(C19280xC c19280xC);

    void reportScrollForDebugNew(C193668hm c193668hm);
}
