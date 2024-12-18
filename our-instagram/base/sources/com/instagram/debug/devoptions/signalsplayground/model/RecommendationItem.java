package com.instagram.debug.devoptions.signalsplayground.model;

import X.C120985dq;
import X.C14360o3;
import X.HYM;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public abstract class RecommendationItem {

    /* loaded from: classes7.dex */
    public final class AudioRecommendation extends RecommendationItem {
        public final HYM audioItem;

        public AudioRecommendation(HYM hym) {
            C14360o3.A0B(hym, 1);
            this.audioItem = hym;
        }

        public final HYM component1() {
            return this.audioItem;
        }

        public final AudioRecommendation copy(HYM hym) {
            C14360o3.A0B(hym, 0);
            return new AudioRecommendation(hym);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof AudioRecommendation) && C14360o3.A0K(this.audioItem, ((AudioRecommendation) obj).audioItem));
        }

        public int hashCode() {
            return this.audioItem.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ AudioRecommendation copy$default(AudioRecommendation audioRecommendation, HYM hym, int i, Object obj) {
            if ((i & 1) != 0) {
                hym = audioRecommendation.audioItem;
            }
            C14360o3.A0B(hym, 0);
            return new AudioRecommendation(hym);
        }

        public final HYM getAudioItem() {
            return this.audioItem;
        }
    }

    /* loaded from: classes7.dex */
    public final class ClipsRecommendation extends RecommendationItem {
        public final C120985dq clipsItem;

        public ClipsRecommendation(C120985dq c120985dq) {
            C14360o3.A0B(c120985dq, 1);
            this.clipsItem = c120985dq;
        }

        public final C120985dq component1() {
            return this.clipsItem;
        }

        public final ClipsRecommendation copy(C120985dq c120985dq) {
            C14360o3.A0B(c120985dq, 0);
            return new ClipsRecommendation(c120985dq);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ClipsRecommendation) && C14360o3.A0K(this.clipsItem, ((ClipsRecommendation) obj).clipsItem));
        }

        public int hashCode() {
            return this.clipsItem.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ ClipsRecommendation copy$default(ClipsRecommendation clipsRecommendation, C120985dq c120985dq, int i, Object obj) {
            if ((i & 1) != 0) {
                c120985dq = clipsRecommendation.clipsItem;
            }
            C14360o3.A0B(c120985dq, 0);
            return new ClipsRecommendation(c120985dq);
        }

        public final C120985dq getClipsItem() {
            return this.clipsItem;
        }
    }

    public /* synthetic */ RecommendationItem(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public RecommendationItem() {
    }
}
