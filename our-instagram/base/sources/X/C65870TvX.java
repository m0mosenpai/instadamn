package X;

import com.instagram.autoplay.models.AutoplayPlaybackHistory;
import com.instagram.autoplay.models.AutoplayPlaybackSegment;
import com.instagram.autoplay.models.AutoplayPlaybackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.TvX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65870TvX {
    public C65871TvY A00;
    public final C65863TvQ A01;
    public final InterfaceC71975XDi A02;
    public final List A03;
    public final C13920nI A04;
    public final HashMap A05;

    public C65870TvX(C65863TvQ c65863TvQ, InterfaceC71975XDi interfaceC71975XDi, C13920nI c13920nI) {
        C14360o3.A0B(c13920nI, 1);
        this.A04 = c13920nI;
        this.A01 = c65863TvQ;
        this.A02 = interfaceC71975XDi;
        this.A05 = new HashMap();
        this.A03 = new ArrayList();
    }

    public final AutoplayPlaybackHistory A01(C38321qM c38321qM) {
        AutoplayPlaybackState autoplayPlaybackState;
        C14360o3.A0B(c38321qM, 0);
        String id = c38321qM.getId();
        HashMap hashMap = this.A05;
        AutoplayPlaybackHistory autoplayPlaybackHistory = (AutoplayPlaybackHistory) hashMap.get(id);
        if (autoplayPlaybackHistory == null) {
            autoplayPlaybackHistory = new AutoplayPlaybackHistory(c38321qM, AutoplayPlaybackState.UNKNOWN, System.currentTimeMillis(), new ArrayList());
        }
        if (id != null) {
            boolean isPlaying = autoplayPlaybackHistory.currentState.isPlaying();
            boolean BJq = this.A02.BJq(c38321qM);
            if (isPlaying != BJq) {
                if (BJq) {
                    if (!isPlaying) {
                        autoplayPlaybackState = AutoplayPlaybackState.PLAYING;
                    } else {
                        return autoplayPlaybackHistory;
                    }
                } else {
                    if (!isPlaying) {
                        return autoplayPlaybackHistory;
                    }
                    autoplayPlaybackState = AutoplayPlaybackState.PAUSED;
                }
                A02(autoplayPlaybackState, c38321qM);
                AutoplayPlaybackHistory autoplayPlaybackHistory2 = (AutoplayPlaybackHistory) hashMap.get(id);
                if (autoplayPlaybackHistory2 == null) {
                    return new AutoplayPlaybackHistory(c38321qM, AutoplayPlaybackState.UNKNOWN, System.currentTimeMillis(), new ArrayList());
                }
                return autoplayPlaybackHistory2;
            }
            return autoplayPlaybackHistory;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A02(AutoplayPlaybackState autoplayPlaybackState, C38321qM c38321qM) {
        String id = c38321qM.getId();
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = this.A05;
        AutoplayPlaybackHistory autoplayPlaybackHistory = (AutoplayPlaybackHistory) hashMap.get(id);
        if (autoplayPlaybackHistory == null) {
            autoplayPlaybackHistory = new AutoplayPlaybackHistory(c38321qM, autoplayPlaybackState, currentTimeMillis, new ArrayList());
            if (id != null) {
                hashMap.put(id, autoplayPlaybackHistory);
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            AutoplayPlaybackState autoplayPlaybackState2 = autoplayPlaybackHistory.currentState;
            if (autoplayPlaybackState2 != autoplayPlaybackState) {
                List list = autoplayPlaybackHistory.historicalPlaybackSegments;
                long j = autoplayPlaybackHistory.currentStateStartTime;
                list.add(new AutoplayPlaybackSegment(autoplayPlaybackState2, j, currentTimeMillis - j));
                autoplayPlaybackHistory.currentStateStartTime = currentTimeMillis;
                autoplayPlaybackHistory.currentState = autoplayPlaybackState;
            }
        }
        AbstractC43594JPz.A1Q(autoplayPlaybackHistory, this.A03);
    }

    public static final void A00(C65870TvX c65870TvX) {
        List list = c65870TvX.A03;
        C50262MHr c50262MHr = new C50262MHr(c65870TvX, 16);
        C14360o3.A0B(list, 0);
        AnonymousClass016.A1B(list, c50262MHr, false);
    }
}
