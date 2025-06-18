def call(String url,String branch) {
   echo "This is Coding Stage"
   git url: "${url}", branch: "${branch}"
   echo "Git cloning has been created successfully"
}
