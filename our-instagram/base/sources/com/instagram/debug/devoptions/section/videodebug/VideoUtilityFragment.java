package com.instagram.debug.devoptions.section.videodebug;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC68643VZb;
import X.C00O;
import X.C0f9;
import X.C0fQ;
import X.C14360o3;
import X.C17280tP;
import X.C30G;
import X.C4QP;
import X.C4QS;
import X.C4QT;
import X.C4QW;
import X.C4S7;
import X.C4SC;
import X.C75363a3;
import X.EnumC95184Qe;
import X.InterfaceC09390do;
import X.MSX;
import X.VYG;
import X.VZZ;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class VideoUtilityFragment extends AbstractC59962oe implements C30G {
    public static final Companion Companion = new Object();
    public CheckBox audioEnable;
    public TextView currentPosition;
    public int currentProdTotal;
    public long currentSnaplTotal;
    public TextView currentStatus;
    public TextView currentVolume;
    public SeekBar debugSeekBar;
    public C4QW igVideoPlayer;
    public CheckBox isLooping;
    public boolean isPaused;
    public TextView loopCount;
    public Button minusHalfMin;
    public Button minusOneMin;
    public Button plusHalfMin;
    public Button plusOneMin;
    public TextView prodLastPausePosition;
    public TextView prodTimeSpent;
    public TextView prodTimeSpentSoundOn;
    public TextView prodTimeSpentTotal;
    public Button restoreVideo;
    public TextView snaplLastPausePosition;
    public TextView snaplTimeSpent;
    public TextView snaplTimeSpentSoundOn;
    public TextView snaplTimeSpentTotal;
    public SimpleVideoLayout videoContainer;
    public final Handler mainHandler = AbstractC167007dF.A0J();
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    /* loaded from: classes11.dex */
    public final class Companion {
        public final VideoUtilityFragment newInstance(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
            VideoUtilityFragment videoUtilityFragment = new VideoUtilityFragment();
            videoUtilityFragment.setArguments(bundle);
            return videoUtilityFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final VideoUtilityFragment newInstance(String str) {
        return Companion.newInstance(str);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "video_utility";
    }

    @Override // X.C30G
    public void onCompletion() {
    }

    @Override // X.C30G
    public void onCues(List list) {
    }

    @Override // X.C30G
    public void onDrawnToSurface() {
    }

    @Override // X.C30G
    public void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C30G
    public void onProgressStateChanged(boolean z) {
    }

    @Override // X.C30G
    public void onSeeking(long j) {
    }

    @Override // X.C30G
    public void onStopVideo(String str, boolean z) {
    }

    @Override // X.C30G
    public void onStopped(C4S7 c4s7, int i) {
    }

    @Override // X.C30G
    public void onSurfaceTextureDestroyed() {
    }

    @Override // X.C30G
    public void onSurfaceTextureUpdated(C4S7 c4s7) {
    }

    @Override // X.C30G
    public void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C30G
    public void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    public void onVideoPlayerPaused() {
    }

    @Override // X.C30G
    public void onVideoPrepared(C4S7 c4s7, boolean z) {
        String str;
        C14360o3.A0B(c4s7, 0);
        CheckBox checkBox = this.audioEnable;
        if (checkBox == null) {
            str = "audioEnable";
        } else {
            checkBox.setChecked(c4s7.A00);
            SeekBar seekBar = this.debugSeekBar;
            if (seekBar == null) {
                str = "debugSeekBar";
            } else {
                C4QW c4qw = this.igVideoPlayer;
                if (c4qw == null) {
                    str = "igVideoPlayer";
                } else {
                    seekBar.setMax(c4qw.Azm());
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public void onVideoSizeChanged(int i, int i2, float f) {
    }

    @Override // X.C30G
    public void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C30G
    public void onVideoSwitchToWarmupPlayer(C4S7 c4s7) {
    }

    @Override // X.C30G
    public void onVideoViewPrepared(C4S7 c4s7) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        TextView textView = this.prodTimeSpent;
        if (textView == null) {
            str = "prodTimeSpent";
        } else {
            textView.setText("0");
            TextView textView2 = this.prodTimeSpentTotal;
            if (textView2 == null) {
                str = "prodTimeSpentTotal";
            } else {
                textView2.setText("0");
                TextView textView3 = this.prodLastPausePosition;
                if (textView3 == null) {
                    str = "prodLastPausePosition";
                } else {
                    textView3.setText("0");
                    TextView textView4 = this.prodTimeSpentSoundOn;
                    if (textView4 == null) {
                        str = "prodTimeSpentSoundOn";
                    } else {
                        textView4.setText("0");
                        TextView textView5 = this.snaplTimeSpent;
                        if (textView5 == null) {
                            str = "snaplTimeSpent";
                        } else {
                            textView5.setText("0");
                            TextView textView6 = this.snaplTimeSpentTotal;
                            if (textView6 == null) {
                                str = "snaplTimeSpentTotal";
                            } else {
                                textView6.setText("0");
                                TextView textView7 = this.snaplLastPausePosition;
                                if (textView7 == null) {
                                    str = "snaplLastPausePosition";
                                } else {
                                    textView7.setText("0");
                                    TextView textView8 = this.snaplTimeSpentSoundOn;
                                    if (textView8 == null) {
                                        str = "snaplTimeSpentSoundOn";
                                    } else {
                                        textView8.setText("0");
                                        super.onViewCreated(view, bundle);
                                        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onViewCreated$1
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                int A05 = C0f9.A05(-2092470217);
                                                VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                                                videoUtilityFragment.togglePause(videoUtilityFragment.isPaused);
                                                C0f9.A0C(538528760, A05);
                                            }
                                        }, view);
                                        CheckBox checkBox = this.isLooping;
                                        if (checkBox == null) {
                                            str = "isLooping";
                                        } else {
                                            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onViewCreated$2
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                                    C4QW c4qw = VideoUtilityFragment.this.igVideoPlayer;
                                                    if (c4qw == null) {
                                                        C14360o3.A0F("igVideoPlayer");
                                                        throw C00O.createAndThrow();
                                                    }
                                                    c4qw.EYb(z);
                                                }
                                            });
                                            setAudioVolume();
                                            Button button = this.plusOneMin;
                                            if (button == null) {
                                                str = "plusOneMin";
                                            } else {
                                                C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onViewCreated$3
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        String str2;
                                                        int A05 = C0f9.A05(-507532222);
                                                        VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                                                        C4QW c4qw = videoUtilityFragment.igVideoPlayer;
                                                        if (c4qw == null) {
                                                            str2 = "igVideoPlayer";
                                                        } else {
                                                            SeekBar seekBar = videoUtilityFragment.debugSeekBar;
                                                            str2 = "debugSeekBar";
                                                            if (seekBar != null) {
                                                                int progress = seekBar.getProgress() + 60000;
                                                                SeekBar seekBar2 = VideoUtilityFragment.this.debugSeekBar;
                                                                if (seekBar2 != null) {
                                                                    c4qw.EMg(Math.min(progress, seekBar2.getMax()), true);
                                                                    C0f9.A0C(1938340238, A05);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        C14360o3.A0F(str2);
                                                        throw C00O.createAndThrow();
                                                    }
                                                }, button);
                                                Button button2 = this.minusOneMin;
                                                if (button2 == null) {
                                                    str = "minusOneMin";
                                                } else {
                                                    C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onViewCreated$4
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            String str2;
                                                            int A05 = C0f9.A05(1589182160);
                                                            VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                                                            C4QW c4qw = videoUtilityFragment.igVideoPlayer;
                                                            if (c4qw == null) {
                                                                str2 = "igVideoPlayer";
                                                            } else {
                                                                SeekBar seekBar = videoUtilityFragment.debugSeekBar;
                                                                if (seekBar == null) {
                                                                    str2 = "debugSeekBar";
                                                                } else {
                                                                    c4qw.EMg(Math.max(seekBar.getProgress() - 60000, 0), true);
                                                                    C0f9.A0C(-706981515, A05);
                                                                    return;
                                                                }
                                                            }
                                                            C14360o3.A0F(str2);
                                                            throw C00O.createAndThrow();
                                                        }
                                                    }, button2);
                                                    Button button3 = this.plusHalfMin;
                                                    if (button3 == null) {
                                                        str = "plusHalfMin";
                                                    } else {
                                                        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onViewCreated$5
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                String str2;
                                                                int A05 = C0f9.A05(-588057943);
                                                                VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                                                                C4QW c4qw = videoUtilityFragment.igVideoPlayer;
                                                                if (c4qw == null) {
                                                                    str2 = "igVideoPlayer";
                                                                } else {
                                                                    SeekBar seekBar = videoUtilityFragment.debugSeekBar;
                                                                    str2 = "debugSeekBar";
                                                                    if (seekBar != null) {
                                                                        int progress = seekBar.getProgress() + 30000;
                                                                        SeekBar seekBar2 = VideoUtilityFragment.this.debugSeekBar;
                                                                        if (seekBar2 != null) {
                                                                            c4qw.EMg(Math.min(progress, seekBar2.getMax()), true);
                                                                            C0f9.A0C(-134229603, A05);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                C14360o3.A0F(str2);
                                                                throw C00O.createAndThrow();
                                                            }
                                                        }, button3);
                                                        Button button4 = this.minusHalfMin;
                                                        if (button4 == null) {
                                                            str = "minusHalfMin";
                                                        } else {
                                                            C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onViewCreated$6
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    String str2;
                                                                    int A05 = C0f9.A05(1592368532);
                                                                    VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                                                                    C4QW c4qw = videoUtilityFragment.igVideoPlayer;
                                                                    if (c4qw == null) {
                                                                        str2 = "igVideoPlayer";
                                                                    } else {
                                                                        if (videoUtilityFragment.debugSeekBar == null) {
                                                                            str2 = "debugSeekBar";
                                                                        } else {
                                                                            c4qw.EMg(Math.max(r0.getProgress() - 30000, 0), true);
                                                                            C0f9.A0C(-1345530063, A05);
                                                                            return;
                                                                        }
                                                                    }
                                                                    C14360o3.A0F(str2);
                                                                    throw C00O.createAndThrow();
                                                                }
                                                            }, button4);
                                                            SeekBar seekBar = this.debugSeekBar;
                                                            if (seekBar == null) {
                                                                str = "debugSeekBar";
                                                            } else {
                                                                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onViewCreated$7
                                                                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                                    public void onStartTrackingTouch(SeekBar seekBar2) {
                                                                    }

                                                                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                                    public void onStopTrackingTouch(SeekBar seekBar2) {
                                                                    }

                                                                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                                                                    public void onProgressChanged(SeekBar seekBar2, final int i, boolean z) {
                                                                        if (z) {
                                                                            final VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                                                                            videoUtilityFragment.mainHandler.post(new Runnable() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onViewCreated$7$onProgressChanged$1
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    C4QW c4qw = VideoUtilityFragment.this.igVideoPlayer;
                                                                                    if (c4qw == null) {
                                                                                        C14360o3.A0F("igVideoPlayer");
                                                                                        throw C00O.createAndThrow();
                                                                                    }
                                                                                    c4qw.EMg(i, true);
                                                                                }
                                                                            });
                                                                        }
                                                                    }
                                                                });
                                                                Button button5 = this.restoreVideo;
                                                                if (button5 == null) {
                                                                    str = "restoreVideo";
                                                                } else {
                                                                    C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onViewCreated$8
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view2) {
                                                                            String str2;
                                                                            int A05 = C0f9.A05(-1800012896);
                                                                            VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                                                                            videoUtilityFragment.currentProdTotal = 0;
                                                                            videoUtilityFragment.currentSnaplTotal = 0L;
                                                                            TextView textView9 = videoUtilityFragment.prodTimeSpent;
                                                                            if (textView9 == null) {
                                                                                str2 = "prodTimeSpent";
                                                                            } else {
                                                                                textView9.setText("0");
                                                                                TextView textView10 = VideoUtilityFragment.this.prodTimeSpentTotal;
                                                                                if (textView10 == null) {
                                                                                    str2 = "prodTimeSpentTotal";
                                                                                } else {
                                                                                    textView10.setText("0");
                                                                                    TextView textView11 = VideoUtilityFragment.this.prodLastPausePosition;
                                                                                    if (textView11 == null) {
                                                                                        str2 = "prodLastPausePosition";
                                                                                    } else {
                                                                                        textView11.setText("0");
                                                                                        TextView textView12 = VideoUtilityFragment.this.prodTimeSpentSoundOn;
                                                                                        if (textView12 == null) {
                                                                                            str2 = "prodTimeSpentSoundOn";
                                                                                        } else {
                                                                                            textView12.setText("0");
                                                                                            TextView textView13 = VideoUtilityFragment.this.snaplTimeSpent;
                                                                                            if (textView13 == null) {
                                                                                                str2 = "snaplTimeSpent";
                                                                                            } else {
                                                                                                textView13.setText("0");
                                                                                                TextView textView14 = VideoUtilityFragment.this.snaplTimeSpentTotal;
                                                                                                if (textView14 == null) {
                                                                                                    str2 = "snaplTimeSpentTotal";
                                                                                                } else {
                                                                                                    textView14.setText("0");
                                                                                                    TextView textView15 = VideoUtilityFragment.this.snaplLastPausePosition;
                                                                                                    if (textView15 == null) {
                                                                                                        str2 = "snaplLastPausePosition";
                                                                                                    } else {
                                                                                                        textView15.setText("0");
                                                                                                        TextView textView16 = VideoUtilityFragment.this.snaplTimeSpentSoundOn;
                                                                                                        if (textView16 == null) {
                                                                                                            str2 = "snaplTimeSpentSoundOn";
                                                                                                        } else {
                                                                                                            textView16.setText("0");
                                                                                                            TextView textView17 = VideoUtilityFragment.this.loopCount;
                                                                                                            if (textView17 == null) {
                                                                                                                str2 = "loopCount";
                                                                                                            } else {
                                                                                                                textView17.setText("0");
                                                                                                                VideoUtilityFragment videoUtilityFragment2 = VideoUtilityFragment.this;
                                                                                                                videoUtilityFragment2.isPaused = false;
                                                                                                                C4QW c4qw = videoUtilityFragment2.igVideoPlayer;
                                                                                                                String str3 = "igVideoPlayer";
                                                                                                                if (c4qw != null) {
                                                                                                                    C75363a3 c75363a3 = VZZ.A02;
                                                                                                                    SimpleVideoLayout simpleVideoLayout = videoUtilityFragment2.videoContainer;
                                                                                                                    if (simpleVideoLayout == null) {
                                                                                                                        str3 = "videoContainer";
                                                                                                                    } else {
                                                                                                                        c4qw.E5v(new C4SC(simpleVideoLayout, new C4QP(false, false, false, false), c75363a3, VZZ.A03, null, "video_utility", VZZ.A00, -1, 0, true));
                                                                                                                        C4QW c4qw2 = VideoUtilityFragment.this.igVideoPlayer;
                                                                                                                        if (c4qw2 != null) {
                                                                                                                            c4qw2.EYb(false);
                                                                                                                            CheckBox checkBox2 = VideoUtilityFragment.this.isLooping;
                                                                                                                            if (checkBox2 == null) {
                                                                                                                                str2 = "isLooping";
                                                                                                                            } else {
                                                                                                                                checkBox2.setChecked(false);
                                                                                                                                C4QW c4qw3 = VideoUtilityFragment.this.igVideoPlayer;
                                                                                                                                if (c4qw3 != null) {
                                                                                                                                    c4qw3.EhI(0.0f, 1);
                                                                                                                                    CheckBox checkBox3 = VideoUtilityFragment.this.audioEnable;
                                                                                                                                    if (checkBox3 == null) {
                                                                                                                                        str2 = "audioEnable";
                                                                                                                                    } else {
                                                                                                                                        checkBox3.setChecked(false);
                                                                                                                                        C0f9.A0C(-1464457553, A05);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                C14360o3.A0F(str3);
                                                                                                                throw C00O.createAndThrow();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            C14360o3.A0F(str2);
                                                                            throw C00O.createAndThrow();
                                                                        }
                                                                    }, button5);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void setAudioVolume() {
        CheckBox checkBox = this.audioEnable;
        if (checkBox == null) {
            C14360o3.A0F("audioEnable");
            throw C00O.createAndThrow();
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$setAudioVolume$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                float f;
                C4QW c4qw = VideoUtilityFragment.this.igVideoPlayer;
                if (z) {
                    if (c4qw != null) {
                        f = 0.5f;
                        c4qw.EhI(f, 1);
                        return;
                    }
                    C14360o3.A0F("igVideoPlayer");
                    throw C00O.createAndThrow();
                }
                if (c4qw != null) {
                    f = 0.0f;
                    c4qw.EhI(f, 1);
                    return;
                }
                C14360o3.A0F("igVideoPlayer");
                throw C00O.createAndThrow();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void togglePause(boolean z) {
        String str = "igVideoPlayer";
        if (z) {
            this.isPaused = false;
            TextView textView = this.loopCount;
            if (textView == null) {
                str = "loopCount";
            } else {
                textView.setText("0");
                C4QW c4qw = this.igVideoPlayer;
                if (c4qw != null) {
                    c4qw.E4T("tapped", false);
                    return;
                }
            }
        } else {
            this.isPaused = true;
            C4QW c4qw2 = this.igVideoPlayer;
            if (c4qw2 != null) {
                c4qw2.E3d("tapped");
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }

    @Override // X.C30G
    public void onLoop(int i) {
        TextView textView = this.loopCount;
        if (textView == null) {
            C14360o3.A0F("loopCount");
            throw C00O.createAndThrow();
        }
        MSX.A15(textView, i);
    }

    @Override // X.C30G
    public void onProgressUpdate(int i, int i2, boolean z) {
        String str;
        TextView textView = this.currentPosition;
        if (textView == null) {
            str = "currentPosition";
        } else {
            MSX.A15(textView, i);
            SeekBar seekBar = this.debugSeekBar;
            if (seekBar == null) {
                str = "debugSeekBar";
            } else {
                seekBar.setProgress(i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public void onSnaplTimeChanged(final long j, final long j2, final long j3) {
        FragmentActivity activity;
        if (this.isPaused && (activity = getActivity()) != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onSnaplTimeChanged$1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    TextView textView = VideoUtilityFragment.this.snaplTimeSpent;
                    if (textView == null) {
                        str = "snaplTimeSpent";
                    } else {
                        textView.setText(String.valueOf(j));
                        VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                        long j4 = videoUtilityFragment.currentSnaplTotal + j;
                        videoUtilityFragment.currentSnaplTotal = j4;
                        TextView textView2 = videoUtilityFragment.snaplTimeSpentTotal;
                        if (textView2 == null) {
                            str = "snaplTimeSpentTotal";
                        } else {
                            textView2.setText(String.valueOf(j4));
                            TextView textView3 = VideoUtilityFragment.this.snaplLastPausePosition;
                            if (textView3 == null) {
                                str = "snaplLastPausePosition";
                            } else {
                                textView3.setText(String.valueOf(j2));
                                TextView textView4 = VideoUtilityFragment.this.snaplTimeSpentSoundOn;
                                if (textView4 == null) {
                                    str = "snaplTimeSpentSoundOn";
                                } else {
                                    textView4.setText(String.valueOf(j3));
                                    return;
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            });
        }
    }

    public void onTimeChanged(final int i, final int i2, final int i3) {
        FragmentActivity activity;
        if (this.isPaused && (activity = getActivity()) != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onTimeChanged$1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    TextView textView = VideoUtilityFragment.this.prodTimeSpent;
                    if (textView == null) {
                        str = "prodTimeSpent";
                    } else {
                        MSX.A15(textView, i);
                        VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                        int i4 = videoUtilityFragment.currentProdTotal + i;
                        videoUtilityFragment.currentProdTotal = i4;
                        TextView textView2 = videoUtilityFragment.prodTimeSpentTotal;
                        if (textView2 == null) {
                            str = "prodTimeSpentTotal";
                        } else {
                            MSX.A15(textView2, i4);
                            TextView textView3 = VideoUtilityFragment.this.prodLastPausePosition;
                            if (textView3 == null) {
                                str = "prodLastPausePosition";
                            } else {
                                MSX.A15(textView3, i2);
                                TextView textView4 = VideoUtilityFragment.this.prodTimeSpentSoundOn;
                                if (textView4 == null) {
                                    str = "prodTimeSpentSoundOn";
                                } else {
                                    MSX.A15(textView4, i3);
                                    return;
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(684469738);
        super.onCreate(bundle);
        C17280tP A00 = C17280tP.A4E.A00();
        AbstractC167007dF.A1L(A00, A00.A18, C17280tP.A4G, 4, true);
        AbstractC68643VZb.A04.add(this);
        VYG.A00.add(this);
        C0f9.A09(986498745, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1028004669);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.video_utility_layout, viewGroup, false);
        this.videoContainer = (SimpleVideoLayout) inflate.findViewById(R.id.video_container);
        this.prodTimeSpent = (TextView) inflate.findViewById(R.id.prod_time_spent);
        this.prodTimeSpentTotal = (TextView) inflate.findViewById(R.id.prod_time_spent_total);
        this.snaplTimeSpent = (TextView) inflate.findViewById(R.id.snapl_time_spent);
        this.snaplTimeSpentTotal = (TextView) inflate.findViewById(R.id.snapl_time_spent_total);
        this.isLooping = (CheckBox) inflate.findViewById(R.id.set_loop_button);
        this.audioEnable = (CheckBox) inflate.findViewById(R.id.set_audio_button);
        this.currentPosition = (TextView) inflate.findViewById(R.id.current_position);
        this.loopCount = (TextView) inflate.findViewById(R.id.loop_count);
        this.currentStatus = (TextView) inflate.findViewById(R.id.current_status);
        this.prodLastPausePosition = (TextView) inflate.findViewById(R.id.prod_last_pause_position);
        this.snaplLastPausePosition = (TextView) inflate.findViewById(R.id.snapl_last_pause_position);
        this.currentVolume = (TextView) inflate.findViewById(R.id.current_volume);
        this.debugSeekBar = (SeekBar) inflate.findViewById(R.id.video_seekbar);
        this.prodTimeSpentSoundOn = (TextView) inflate.findViewById(R.id.prod_time_spent_sound_on);
        this.snaplTimeSpentSoundOn = (TextView) inflate.findViewById(R.id.snapl_time_spent_sound_on);
        this.plusOneMin = (Button) inflate.findViewById(R.id.plus_one_min);
        this.minusOneMin = (Button) inflate.findViewById(R.id.minus_one_min);
        this.plusHalfMin = (Button) inflate.findViewById(R.id.plus_half_min);
        this.minusHalfMin = (Button) inflate.findViewById(R.id.minus_half_min);
        this.restoreVideo = (Button) inflate.findViewById(R.id.restore);
        C0f9.A09(-1936765210, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(1697556586);
        super.onDestroy();
        C17280tP A00 = C17280tP.A4E.A00();
        AbstractC167007dF.A1L(A00, A00.A18, C17280tP.A4G, 4, false);
        AbstractC68643VZb.A04.remove(this);
        VYG.A00.remove(this);
        C0f9.A09(491204848, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = C0f9.A02(-1266972264);
        super.onPause();
        C4QW c4qw = this.igVideoPlayer;
        if (c4qw == null) {
            C14360o3.A0F("igVideoPlayer");
            throw C00O.createAndThrow();
        }
        c4qw.EE4("fragment_paused");
        this.mainHandler.removeCallbacksAndMessages(null);
        C0f9.A09(17682018, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-335831710);
        super.onResume();
        Context context = getContext();
        if (context != null) {
            C4QT A00 = C4QS.A00(context, getSession(), VZZ.A01, this, "video_utility");
            this.igVideoPlayer = A00;
            String str = "igVideoPlayer";
            A00.Ed6(EnumC95184Qe.A04);
            C4QW c4qw = this.igVideoPlayer;
            if (c4qw != null) {
                ((C4QT) c4qw).A0X = true;
                C75363a3 c75363a3 = VZZ.A02;
                SimpleVideoLayout simpleVideoLayout = this.videoContainer;
                if (simpleVideoLayout == null) {
                    str = "videoContainer";
                } else {
                    c4qw.E5v(new C4SC(simpleVideoLayout, new C4QP(false, false, false, false), c75363a3, VZZ.A03, null, "video_utility", VZZ.A00, -1, 0, true));
                    this.mainHandler.post(new Runnable() { // from class: com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment$onResume$1
                        @Override // java.lang.Runnable
                        public void run() {
                            String str2;
                            VideoUtilityFragment videoUtilityFragment = VideoUtilityFragment.this;
                            TextView textView = videoUtilityFragment.currentStatus;
                            if (textView == null) {
                                str2 = "currentStatus";
                            } else {
                                C4QW c4qw2 = videoUtilityFragment.igVideoPlayer;
                                if (c4qw2 != null) {
                                    textView.setText(((C4QT) c4qw2).A0M.toString());
                                    VideoUtilityFragment videoUtilityFragment2 = VideoUtilityFragment.this;
                                    TextView textView2 = videoUtilityFragment2.currentVolume;
                                    if (textView2 == null) {
                                        str2 = "currentVolume";
                                    } else {
                                        C4QW c4qw3 = videoUtilityFragment2.igVideoPlayer;
                                        if (c4qw3 != null) {
                                            textView2.setText(String.valueOf(((C4QT) c4qw3).A02));
                                            VideoUtilityFragment.this.mainHandler.postDelayed(this, 200L);
                                            return;
                                        }
                                    }
                                }
                                C14360o3.A0F("igVideoPlayer");
                                throw C00O.createAndThrow();
                            }
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                    });
                    C0f9.A09(-1052382620, A02);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-979551252, A02);
        throw A0g;
    }
}
