package X;

import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.profile.fragment.UserDetailFragment;

/* loaded from: classes8.dex */
public final class JWV extends C1P1 {
    public final /* synthetic */ NotesRepository A00;
    public final /* synthetic */ UserDetailFragment A01;
    public final /* synthetic */ String A02;

    public JWV(NotesRepository notesRepository, UserDetailFragment userDetailFragment, String str) {
        this.A01 = userDetailFragment;
        this.A00 = notesRepository;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-2037923139);
        C1565971h c1565971h = (C1565971h) obj;
        int A032 = C0f9.A03(-1405018202);
        super.onSuccess(c1565971h);
        UserDetailFragment userDetailFragment = this.A01;
        UserDetailFragment.A0O(c1565971h.A00, userDetailFragment);
        if (AbstractC82073lT.A01(userDetailFragment.A0I)) {
            NotesRepository notesRepository = this.A00;
            String str = this.A02;
            notesRepository.A0K(c1565971h.A00, str);
            C72S.A00(userDetailFragment.A0I).A01.put(str, AbstractC31173DnH.A0g());
        }
        C0f9.A0A(272944443, A032);
        C0f9.A0A(-301472994, A03);
    }
}
